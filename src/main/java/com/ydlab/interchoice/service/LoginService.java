package com.ydlab.interchoice.service;

import com.ydlab.interchoice.domain.Login;
import com.ydlab.interchoice.domain.LoginExample;
import com.ydlab.interchoice.exception.BusinessException;
import com.ydlab.interchoice.exception.BusinessExceptionCode;
import com.ydlab.interchoice.mapper.LoginMapper;
import com.ydlab.interchoice.req.LoginReq;
import com.ydlab.interchoice.req.RegisterReq;
import com.ydlab.interchoice.resp.CommonResp;
import com.ydlab.interchoice.resp.LoginResp;
import com.ydlab.interchoice.util.CopyUtil;
import com.ydlab.interchoice.util.SnowFlake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginService {
    @Resource
    private LoginMapper loginMapper;
    private static final Logger LOG = LoggerFactory.getLogger(LoginService.class);
    @Resource
    private SnowFlake snowFlake;
    /**
     * 登录
     */
    public LoginResp login(LoginReq req) {
        Login userDb = loginMapper.selectByPrimaryKey(req.getStudentId());
        if (ObjectUtils.isEmpty(userDb)) {
            // 用户ID不存在
            LoginResp userLoginResp1 =new LoginResp();
            userLoginResp1.setStudentId(0);
            LOG.info("用户名不存在, {}", req.getStudentId());
            return  userLoginResp1;
        } else {
            if (userDb.getPassword().equals(req.getPassword())) {
                // 登录成功
                LoginResp userLoginResp = CopyUtil.copy(userDb, LoginResp.class);
                return userLoginResp;
            } else {
                // 密码不对
                LOG.info("密码不对, 输入密码：{}, 数据库密码：{}", req.getPassword(), userDb.getPassword());
                LoginResp userLoginResp2 =new LoginResp();
                userLoginResp2.setPassword(null);
                return userLoginResp2;
            }
        }
    }

//    public Login findUserByName(Integer studentId) {
//
//        return loginMapper.selectByPrimaryKey(studentId);
//    }
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
