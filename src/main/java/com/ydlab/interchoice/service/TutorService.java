package com.ydlab.interchoice.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.ydlab.interchoice.domain.Tutor;
import com.ydlab.interchoice.domain.TutorExample;
import com.ydlab.interchoice.mapper.TutorMapper;
import com.ydlab.interchoice.req.TutorReq;
import com.ydlab.interchoice.resp.TutorResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class TutorService {
    @Resource
    private TutorMapper tutorMapper;
    public List<TutorResp> list(TutorReq req){
        TutorExample tutorExample = new TutorExample();
        TutorExample.Criteria criteria = tutorExample.createCriteria();
        criteria.andResearchDirectionLike("%"+req.getResearchDirection()+"%");
        List<Tutor> tutorList = tutorMapper.selectByExample(tutorExample);
        List<TutorResp> respList = new ArrayList<>();
        for (Tutor tutor:tutorList){
            TutorResp tutorResp = new TutorResp();
            BeanUtils.copyProperties(tutor,tutorResp);
            respList.add(tutorResp);
        }
        return respList;
    }
}
