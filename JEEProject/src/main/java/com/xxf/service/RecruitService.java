package com.xxf.service;

import com.xxf.model.Recruit;

import java.util.List;

public interface RecruitService {
    Recruit getRec(int id);
    List<Recruit> getAllRecs();
}
