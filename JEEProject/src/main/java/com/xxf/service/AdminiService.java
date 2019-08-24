package com.xxf.service;

import com.xxf.model.Admini;

public interface AdminiService {
    boolean register(Admini admini);
    Admini login(Admini admini);
}
