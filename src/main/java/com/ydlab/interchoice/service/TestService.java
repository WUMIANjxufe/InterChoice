package com.ydlab.interchoice.service;

import com.ydlab.interchoice.domain.test;
import com.ydlab.interchoice.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    public List<test> list(){
        return testMapper.list();
    }
}
