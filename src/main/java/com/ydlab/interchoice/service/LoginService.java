package com.ydlab.interchoice.service;

import com.ydlab.interchoice.domain.Login;
import com.ydlab.interchoice.domain.test;
import com.ydlab.interchoice.mapper.LoginMapper;
import com.ydlab.interchoice.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginService {
    @Resource
    private LoginMapper loginMapper;

    public Login findUserByName(Integer studentId) {
        return loginMapper.selectByPrimaryKey(studentId);
    }
}
