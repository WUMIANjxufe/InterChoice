package com.ydlab.interchoice.service;

import com.ydlab.interchoice.domain.Studentintro;
import com.ydlab.interchoice.domain.Tutor;
import com.ydlab.interchoice.domain.TutorExample;
import com.ydlab.interchoice.mapper.StudentintroMapper;
import com.ydlab.interchoice.mapper.TutorMapper;
import com.ydlab.interchoice.req.StudentintroSaveReq;
import com.ydlab.interchoice.req.TutorReq;
import com.ydlab.interchoice.resp.TutorResp;
import com.ydlab.interchoice.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentInfoService {
    @Resource
    private StudentintroMapper studentintroMapper;
    /*
    * 保存
    * */
    public void save(StudentintroSaveReq req){
        Studentintro studentintro = CopyUtil.copy(req,Studentintro.class);
        if(ObjectUtils.isEmpty(req.getStudentId())){
            studentintroMapper.insert(studentintro);
        }else {
            studentintroMapper.updateByPrimaryKey(studentintro);
        }
    }
}
