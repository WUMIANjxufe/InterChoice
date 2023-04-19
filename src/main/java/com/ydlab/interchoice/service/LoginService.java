package com.ydlab.interchoice.service;

import com.ydlab.interchoice.domain.Login;
import com.ydlab.interchoice.domain.LoginExample;
import com.ydlab.interchoice.mapper.LoginMapper;
import com.ydlab.interchoice.req.RegisterReq;
import com.ydlab.interchoice.resp.CommonResp;
import com.ydlab.interchoice.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginService {
    @Resource
    private LoginMapper loginMapper;
    public Login findUserByName(Integer studentId) {
        return loginMapper.selectByPrimaryKey(studentId);
    }
    public CommonResp insertUser(RegisterReq req){
        CommonResp commonResp = new CommonResp();
        LoginExample loginExample = new LoginExample();
        List<Login> loginlist = loginMapper.selectByExample(loginExample);
        System.out.println("req"+req);
        Login login = CopyUtil.copy(req, Login.class);
        System.out.println("loginlist"+loginlist);
//        System.out.println("contains"+loginlist.contains(login.getStudentId()));
        for(int i=0;i<loginlist.size();i++){
            if(loginlist.get(i).getStudentId()==login.getStudentId()){
                commonResp.setMessage("注册失败");
                break;
            } else if (i==loginlist.size()-1&&(loginlist.get(i-1).getStudentId()!=login.getStudentId())) {
                loginMapper.insert(login);
                commonResp.setMessage("注册成功");
            }
        }
        System.out.println("message"+commonResp.getMessage());
        return commonResp;
    }
}
