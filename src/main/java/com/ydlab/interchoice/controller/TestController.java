package com.ydlab.interchoice.controller;

import com.ydlab.interchoice.domain.test;
import com.ydlab.interchoice.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @GetMapping("test/list")
    public List<test> list(){
        return testService.list();
    }
}
