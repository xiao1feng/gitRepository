package com.xxf.controller;

import com.xxf.model.Admini;
import com.xxf.service.AdminiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class AdminiServlet {
    @Resource
    private AdminiService adminiService;
    @RequestMapping("register1")
    public String register1() throws  Exception{
        return "register";
    }

    @RequestMapping("login1")
    public String login1() throws  Exception{
        return "login";
    }

    @RequestMapping("register")
    public String register(Admini admini, Model model) throws  Exception{
        boolean ad = adminiService.register(admini);
        if (ad){
            model.addAttribute("regi",admini);
            System.out.println("注册成功！");
            return "login";//登录页面
        }
        return "../../index";//注册不成功，主页面或注册页面
    }

    @RequestMapping("login")
    public String login(Admini admini, Model model) throws  Exception{
        Admini adm = adminiService.login(admini);
        if (adm!=null){
            model.addAttribute("adm",adm);
            return "../../index";//登录成功，跳转
        }
        return "login";//登录失败，跳转
    }
}
