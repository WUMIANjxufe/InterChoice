package com.ydlab.interchoice.controller;

import com.alibaba.fastjson.JSONObject;
import com.ydlab.interchoice.req.LoginReq;
import com.ydlab.interchoice.req.NumReq;
import com.ydlab.interchoice.resp.CommonResp;
import com.ydlab.interchoice.resp.LoginResp;
import com.ydlab.interchoice.service.InspectService;
import com.ydlab.interchoice.service.TutorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
@RestController
public class InspectController {
    @Resource
    private InspectService inspectService;
    @ResponseBody
    @RequestMapping(value = "/inspect", method = RequestMethod.POST)
    public CommonResp inspect(NumReq req) {
        System.out.println("req"+req);
        CommonResp resp = new CommonResp<>();
        inspectService.initNum(req);
        resp.setContent(req);
        return resp;
    }
}
