package com.ydlab.interchoice.mapper;

import com.ydlab.interchoice.domain.Tutor;
import com.ydlab.interchoice.domain.TutorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TutorMapper {
    long countByExample(TutorExample example);

    int deleteByExample(TutorExample example);

    int deleteByPrimaryKey(Integer tutorid);

    int insert(Tutor record);

    int insertSelective(Tutor record);

    List<Tutor> selectByExample(TutorExample example);

    Tutor selectByPrimaryKey(Integer tutorid);

    int updateByExampleSelective(@Param("record") Tutor record, @Param("example") TutorExample example);

    int updateByExample(@Param("record") Tutor record, @Param("example") TutorExample example);

    int updateByPrimaryKeySelective(Tutor record);

    int updateByPrimaryKey(Tutor record);
}