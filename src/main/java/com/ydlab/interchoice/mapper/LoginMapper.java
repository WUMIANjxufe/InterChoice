package com.ydlab.interchoice.mapper;

import com.ydlab.interchoice.domain.Login;
import com.ydlab.interchoice.domain.LoginExample;
import java.util.List;

import com.ydlab.interchoice.domain.test;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    long countByExample(LoginExample example);

    int deleteByExample(LoginExample example);

    int deleteByPrimaryKey(Integer studentId);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExample(LoginExample example);

    Login selectByPrimaryKey(Integer studentId);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByPrimaryKeySelective(Login record);

     int updateByPrimaryKey(Login record);
}