package com.xxf.service.serviceImpl;

import com.xxf.dao.AdminiDao;
import com.xxf.model.Admini;
import com.xxf.service.AdminiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminiServiceImpl implements AdminiService {
    @Resource
    private AdminiDao adminiDao;
    public boolean register(Admini admini) {
        if (admini.getA_name()==null || admini.getA_pass()==null){
            return false;
        }
        return adminiDao.addAdmini(admini);
    }

    public Admini login(Admini admini) {
        return adminiDao.getAdminiByNameAndPass(admini);
    }
}
