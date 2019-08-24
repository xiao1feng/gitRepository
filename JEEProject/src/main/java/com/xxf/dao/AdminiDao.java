package com.xxf.dao;

import com.xxf.model.Admini;

public interface AdminiDao {
    Admini getAdminiByNameAndPass(Admini admini);
    boolean addAdmini(Admini admini);
}
