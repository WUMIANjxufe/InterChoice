package com.ydlab.interchoice.mapper;

import com.ydlab.interchoice.domain.Studentintro;
import com.ydlab.interchoice.domain.StudentintroExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentintroMapper {
    long countByExample(StudentintroExample example);

    int deleteByExample(StudentintroExample example);

    int deleteByPrimaryKey(Integer studentId);

    int insert(Studentintro record);

    int insertSelective(Studentintro record);

    List<Studentintro> selectByExample(StudentintroExample example);

    Studentintro selectByPrimaryKey(Integer studentId);

    int updateByExampleSelective(@Param("record") Studentintro record, @Param("example") StudentintroExample example);

    int updateByExample(@Param("record") Studentintro record, @Param("example") StudentintroExample example);

    int updateByPrimaryKeySelective(Studentintro record);

    int updateByPrimaryKey(Studentintro record);
}