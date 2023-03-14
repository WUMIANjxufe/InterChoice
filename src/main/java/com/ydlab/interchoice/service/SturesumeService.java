package com.ydlab.interchoice.service;

import com.ydlab.interchoice.domain.Sturesume;
import com.ydlab.interchoice.domain.SturesumeExample;
import com.ydlab.interchoice.mapper.SturesumeMapper;
import com.ydlab.interchoice.req.SturesumeReq;
import com.ydlab.interchoice.resp.SturesumeResp;
import com.ydlab.interchoice.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SturesumeService {
    @Resource
    private SturesumeMapper sturesumeMapper;
    /*
     * 保存
     * */
    public void save(SturesumeReq req){
        SturesumeExample sturesumeExample = new SturesumeExample();
        List<Sturesume> sturesumeList = sturesumeMapper.selectByExample(sturesumeExample);
        Sturesume sturesume = CopyUtil.copy(req,Sturesume.class);
        if(!sturesumeList.contains(sturesume)){
            sturesumeMapper.insert(sturesume);
        }else {
            sturesumeMapper.updateByPrimaryKey(sturesume);
        }
    }
}
