package com.xxf.service.serviceImpl;

import com.xxf.dao.RecruitDao;
import com.xxf.model.Recruit;
import com.xxf.service.RecruitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource
    private RecruitDao recruitDao;
    public Recruit getRec(int id) {
        if (id<=0){
            return null;
        }
        return recruitDao.getRecById(id);
    }

    public List<Recruit> getAllRecs() {
        return recruitDao.getRecs();
    }
}
