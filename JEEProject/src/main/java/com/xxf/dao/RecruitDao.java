package com.xxf.dao;

import com.xxf.model.Recruit;

import java.util.List;

public interface RecruitDao {
    Recruit getRecById(int id);
    List<Recruit> getRecs();

}
