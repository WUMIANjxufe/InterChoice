package com.ydlab.interchoice.mapper;

import com.ydlab.interchoice.domain.Choose;
import com.ydlab.interchoice.domain.ChooseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChooseMapper {
    long countByExample(ChooseExample example);

    int deleteByExample(ChooseExample example);

    int deleteByPrimaryKey(Integer studentid);

    int insert(Choose record);

    int insertSelective(Choose record);

    List<Choose> selectByExample(ChooseExample example);

    Choose selectByPrimaryKey(Integer studentid);

    int updateByExampleSelective(@Param("record") Choose record, @Param("example") ChooseExample example);

    int updateByExample(@Param("record") Choose record, @Param("example") ChooseExample example);

    int updateByPrimaryKeySelective(Choose record);

    int updateByPrimaryKey(Choose record);
}