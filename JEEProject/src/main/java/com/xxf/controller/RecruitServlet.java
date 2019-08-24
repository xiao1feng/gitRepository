package com.xxf.controller;

import com.xxf.model.Recruit;
import com.xxf.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RecruitServlet {
    @Resource
    private RecruitService recruitService;
    @RequestMapping
    public String getRecruits(Model model) throws  Exception{
        List<Recruit> recs = recruitService.getAllRecs();
        if (recs.size()!=0){
            model.addAttribute("recs",recs);
            return "../../index";//游客页面
        }
        return "main";
    }
}
