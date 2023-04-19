package com.ydlab.interchoice.mapper;

import com.ydlab.interchoice.domain.Sturesume;
import com.ydlab.interchoice.domain.SturesumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SturesumeMapper {
    long countByExample(SturesumeExample example);

    int deleteByExample(SturesumeExample example);

    int deleteByPrimaryKey(String name);

    int insert(Sturesume record);

    int insertSelective(Sturesume record);

    List<Sturesume> selectByExample(SturesumeExample example);

    Sturesume selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Sturesume record, @Param("example") SturesumeExample example);

    int updateByExample(@Param("record") Sturesume record, @Param("example") SturesumeExample example);

    int updateByPrimaryKeySelective(Sturesume record);

    int updateByPrimaryKey(Sturesume record);
}