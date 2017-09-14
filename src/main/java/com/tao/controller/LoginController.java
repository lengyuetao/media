package com.tao.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by DELL on 2017/9/7.
 */
@Controller
public class LoginController {

    private static final Logger logger=Logger.getLogger(LoginController.class);

    @RequestMapping("/back/login")
    public String login(HttpServletRequest request,
                        @RequestParam(value ="userName",required = true)String userName,
                        @RequestParam(value="password",required = true)String password){
        if(userName.equals("admin")&&password.equals("123")){
            request.getSession().setAttribute("userName",userName);
            return "redirect:/back/main";
        }else {
            logger.error("用户名和密码错误！");
            return "redirect:/back/index";
        }
    }

    @RequestMapping("/back/loginOut")
    public String loginOut(HttpServletRequest request){
        request.getSession().removeAttribute("userName");
        return "/back/login";
    }
}
