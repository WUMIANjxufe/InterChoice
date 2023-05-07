package com.ydlab.interchoice.mapper;

import com.ydlab.interchoice.domain.Num;
import com.ydlab.interchoice.domain.NumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NumMapper {
    long countByExample(NumExample example);

    int deleteByExample(NumExample example);

    int deleteByPrimaryKey(Integer studentid);

    int insert(Num record);

    int insertSelective(Num record);

    List<Num> selectByExample(NumExample example);

    Num selectByPrimaryKey(Integer studentid);

    int updateByExampleSelective(@Param("record") Num record, @Param("example") NumExample example);

    int updateByExample(@Param("record") Num record, @Param("example") NumExample example);

    int updateByPrimaryKeySelective(Num record);

    int updateByPrimaryKey(Num record);
}