package com.tao.controller;

import com.tao.utils.jms.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangantao on 2017/5/8.
 */
@Controller
@RequestMapping("/queue")
public class QueueController {

    @Autowired
    private SendMessage sendMessage;

    @RequestMapping(value="/redis")
    public void redis(){

    }
}
