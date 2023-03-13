package com.ydlab.interchoice.controller;

import com.ydlab.interchoice.req.StudentintroSaveReq;
import com.ydlab.interchoice.req.TutorReq;
import com.ydlab.interchoice.resp.CommonResp;
import com.ydlab.interchoice.resp.StudentintroResp;
import com.ydlab.interchoice.resp.TutorResp;
import com.ydlab.interchoice.service.StudentInfoService;
import com.ydlab.interchoice.service.TutorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/studentintro")
public class StudentintroController {
    @Resource
    private StudentInfoService studentInfoService;
    @PostMapping("save")
    public StudentintroResp save(StudentintroSaveReq req){
        StudentintroResp resp = new StudentintroResp<>();
        studentInfoService.save(req);
        return resp;
    }
}
