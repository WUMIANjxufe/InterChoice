package com.ydlab.interchoice.controller;

import com.ydlab.interchoice.domain.Login;
import com.ydlab.interchoice.req.RegisterReq;
import com.ydlab.interchoice.resp.CommonResp;
import com.ydlab.interchoice.service.LoginService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Resource
    private LoginService loginService;
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResp login(HttpSession session, ModelMap map, @RequestParam("username")int studentid,
                           @RequestParam("password")String password){
        CommonResp resp = new CommonResp<>();
        Login userEntity = loginService.findUserByName(studentid);
        if(userEntity!=null && userEntity.getPassword().equals(password)){
            session.setAttribute("id", userEntity.getStudentId());
            session.setAttribute("name",userEntity.getStudentName());
            session.setAttribute("user",userEntity);
            System.out.println("success");
            resp.setMessage("登陆成功");
            return resp;
        }else{
            System.out.println("123123123");
            map.put("msg", "用户名或者密码错误");
            map.addAttribute("tip","密码或者用户名错误");
            resp.setMessage("用户名或者密码错误");
            return resp;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public CommonResp register( RegisterReq req){

        CommonResp resp = new CommonResp<>();
        String message = loginService.insertUser(req).getMessage();
        System.out.println("message"+message);
        resp.setMessage(message);
        return resp;
    }
}
