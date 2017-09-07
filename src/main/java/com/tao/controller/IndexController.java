package com.tao.controller;

import com.tao.entity.UserInfo;
import com.tao.service.UserInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zhangantao on 2017/4/18.
 */
@Controller
public class IndexController {
    Logger log=Logger.getLogger(IndexController.class);

    @Autowired
    UserInfoService userInfoService;
    @RequestMapping("/index")
    public String index(HttpServletRequest request){

        UserInfo userInfo=userInfoService.findUserInfoById(1);
        List<UserInfo> list=userInfoService.findAllUserInfo();

        return "index";
    }
}
