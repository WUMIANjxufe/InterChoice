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
//    @ResponseBody
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public CommonResp login(HttpSession session, ModelMap map, @RequestParam("username")int studentid,
//                           @RequestParam("password")String password){
//        CommonResp resp = new CommonResp<>();
//        Login userEntity = loginService.findUserByName(studentid);
//        if(userEntity!=null && userEntity.getPassword().equals(password)){
//            session.setAttribute("id", userEntity.getStudentId());
//            session.setAttribute("name",userEntity.getStudentName());
//            session.setAttribute("user",userEntity);
//            System.out.println("success");
//            resp.setMessage("登陆成功");
//            return resp;
//        }else{
//            System.out.println("123123123");
//            map.put("msg", "用户名或者密码错误");
//            map.addAttribute("tip","密码或者用户名错误");
//            resp.setMessage("用户名或者密码错误");
//            return resp;
//        }
//    }
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
