package com.ydlab.interchoice.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.ydlab.interchoice.domain.Tutor;
import com.ydlab.interchoice.domain.TutorExample;
import com.ydlab.interchoice.mapper.TutorMapper;
import com.ydlab.interchoice.req.TutorReq;
import com.ydlab.interchoice.resp.TutorResp;
import com.ydlab.interchoice.util.CopyUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class TutorService {
    @Resource
    private TutorMapper tutorMapper;
    public List<TutorResp> tutorlist(){
        List<Tutor> tutorList = tutorMapper.selectAll();
        System.out.println("tutorList"+ tutorMapper.selectAll());
        List<TutorResp> respList = CopyUtil.copyList(tutorList,TutorResp.class);
        System.out.println("resplist"+respList);
        return respList;
    }
}
