package com.ydlab.interchoice.controller;

import com.ydlab.interchoice.req.SturesumeReq;
import com.ydlab.interchoice.resp.CommonResp;
import com.ydlab.interchoice.service.SturesumeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/resume")
public class SturesumeController {
    @Resource
    private SturesumeService sturesumeService;
    @PostMapping("/save")
    public CommonResp save(@RequestBody SturesumeReq req){
        CommonResp  resp = new CommonResp<>();
        sturesumeService.save(req);
        return resp;
    }
}
