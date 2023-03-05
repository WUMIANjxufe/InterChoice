package com.ydlab.interchoice.service;

import com.ydlab.interchoice.domain.Tutor;
import com.ydlab.interchoice.mapper.TutorMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TutorService {
    @Resource
    private TutorMapper TutorMapper;
    public List<Tutor> list(){
        return TutorMapper.selectByExample(null);
    }
}
