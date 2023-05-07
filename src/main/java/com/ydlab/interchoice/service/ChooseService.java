package com.ydlab.interchoice.service;

import com.ydlab.interchoice.domain.Choose;
import com.ydlab.interchoice.domain.ChooseExample;
import com.ydlab.interchoice.mapper.ChooseMapper;
import com.ydlab.interchoice.req.ChooseReq;
import com.ydlab.interchoice.req.UserReq;
import com.ydlab.interchoice.resp.CommonResp;
import com.ydlab.interchoice.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ChooseService {

    @Resource
    private ChooseMapper chooseMapper;
    public CommonResp saveTeacher(ChooseReq req){
        CommonResp commonResp = new CommonResp();
        Choose user = CopyUtil.copy(req, Choose.class);
        System.out.println("savereq"+req);
        if(chooseMapper.selectByPrimaryKey(req.getStudentid())!=null){
            System.out.println("重复选择导师");
            commonResp.setMessage("已选择过导师");
        }else{
            commonResp.setMessage("选择成功");
            chooseMapper.insert(user);
        }
        return commonResp;
    }
    public CommonResp getTutorName(Integer studentid){
        System.out.println("rerere"+studentid);
        CommonResp commonResp = new CommonResp();
        commonResp.setMessage( chooseMapper.selectByPrimaryKey(studentid).getTutorname());
        return commonResp;
    }
    public CommonResp updateTeacher(ChooseReq req){
        CommonResp commonResp = new CommonResp();
        Choose user = CopyUtil.copy(req, Choose.class);
        System.out.println("savereq"+req);
        if(chooseMapper.selectByPrimaryKey(req.getStudentid())!=null){
            System.out.println("重复选择导师");
            commonResp.setMessage("已选择过导师");
        }else{
            commonResp.setMessage("选择成功");
            chooseMapper.insert(user);
        }
        return commonResp;
    }
    public CommonResp cancelTeacher(Integer studentid) {
        CommonResp commonResp = new CommonResp();
        System.out.println("cancelreq" + studentid);
        System.out.println("ddd"+chooseMapper.deleteByPrimaryKey(studentid));
        if (chooseMapper.deleteByPrimaryKey(studentid) != -1) {
            System.out.println("取消成功");
            commonResp.setMessage("取消成功");
        } else {
            commonResp.setMessage("还未选择导师");
        }
        return commonResp;
    }
}
