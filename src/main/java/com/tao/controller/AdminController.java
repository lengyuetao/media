package com.tao.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangantao on 2017/4/20.
 */
@Controller
public class AdminController {
    Logger log=Logger.getLogger(AdminController.class);

    @RequestMapping("/back/index")
    public String index(Model model){
        log.error("登录页面***");
        model.addAttribute("userName","里斯本");
        return "/back/login";
    }
    @RequestMapping("/back/main")
    public String toMain(){
        log.error("管理页面***");
        return "/back/main";
    }

    @RequestMapping("/back/welcome")
    public String welcome(){
        log.error("管理页面***");
        return "/back/welcome";
    }

}
