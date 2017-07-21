package com.tao.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by zhangantao on 2017/4/20.
 */
@Controller
public class AdminController {
    Logger log=Logger.getLogger(AdminController.class);

    @RequestMapping("/back/index")
    public String index(){
        return "/back/login";
    }

    @RequestMapping("/back/main")
    public String toMain(Model model,
                         @RequestParam(value ="userName",required = true)String userName,
                         @RequestParam(value="password",required = true)String password){

        if(userName.equals("admin")&&password.equals("123")){
            model.addAttribute("userName",userName);
            return "/back/main";
        }else{
            log.error("用户名和密码错误！");
            return "redirect:/back/index";
        }

    }

    @RequestMapping("/back/welcome")
    public String welcome(){
        log.error("管理页面***");
        return "/back/welcome";
    }

}
