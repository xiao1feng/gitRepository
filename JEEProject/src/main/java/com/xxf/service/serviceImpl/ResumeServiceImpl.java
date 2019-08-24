package com.xxf.service.serviceImpl;

import com.xxf.dao.ResumeDao;
import com.xxf.model.Resume;
import com.xxf.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeDao resumeDao;
    public boolean writingRes(Resume resume) {
        if (resume==null){
            return false;
        }
        return resumeDao.addResume(resume);
    }
}
