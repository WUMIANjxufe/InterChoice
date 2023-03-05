package com.ydlab.interchoice.controller;

import com.ydlab.interchoice.domain.Tutor;
import com.ydlab.interchoice.req.TutorReq;
import com.ydlab.interchoice.resp.CommonResp;
import com.ydlab.interchoice.resp.TutorResp;
import com.ydlab.interchoice.service.TutorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tutor")
public class TutorController {
    @Resource
    private TutorService tutorService;
    @GetMapping("/list")
    public CommonResp list(TutorReq req){
        CommonResp<List<TutorResp>> resp = new CommonResp<>();
        List<TutorResp> list = tutorService.list(req);
        resp.setContent(list);
        return resp;
    }
}
