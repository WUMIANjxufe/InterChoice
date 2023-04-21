package com.ydlab.interchoice.controller;

import com.alibaba.fastjson.JSONObject;
import com.ydlab.interchoice.req.LoginReq;
import com.ydlab.interchoice.req.RegisterReq;
import com.ydlab.interchoice.resp.CommonResp;
import com.ydlab.interchoice.resp.LoginResp;
import com.ydlab.interchoice.service.LoginService;
import com.ydlab.interchoice.util.SnowFlake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
public class UserController {
    @Resource
    private LoginService loginService;
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    @Resource
    private SnowFlake snowFlake;
    @Resource
    private RedisTemplate<Long, String> redisTemplate;
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResp<LoginResp> login(LoginReq req) {
        System.out.println("req"+req);
       // req.setPassword(DigestUtils.md5DigestAsHex(req.getPassword().getBytes()));
        CommonResp<LoginResp> resp = new CommonResp<>();
        LoginResp userLoginResp = loginService.login(req);
        System.out.println("userLoginResp"+userLoginResp);
        Long token = snowFlake.nextId();
        LOG.info("生成单点登录token：{}，并放入redis中", token);
        userLoginResp.setToken(token.toString());
        redisTemplate.opsForValue().set(token,JSONObject.toJSONString(userLoginResp), 3600 * 24, TimeUnit.SECONDS);
        resp.setContent(userLoginResp);
        System.out.println("content"+resp);
        return resp;
    }
    @GetMapping("/logout/{token}")
    public CommonResp logout(@PathVariable String token){
        CommonResp resp = new CommonResp<>();
        redisTemplate.delete(Long.valueOf(token));
        LOG.info("从redis中删除token:{}",token);
        return resp;
    }
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public CommonResp register( RegisterReq req){
        req.setPassword(DigestUtils.md5DigestAsHex(req.getPassword().getBytes()));
        CommonResp resp = new CommonResp<>();
        String message = loginService.insertUser(req).getMessage();
        System.out.println("message"+message);
        resp.setMessage(message);
        return resp;
    }
}
