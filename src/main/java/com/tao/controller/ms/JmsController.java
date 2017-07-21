package com.tao.controller.ms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.StringTokenizer;

/**
 * Created by DELL on 2017/7/18.
 */
@Controller
public class JmsController {

    @RequestMapping(value="/mesage/push",method = RequestMethod.POST)
    public String pushMessage(){



        return null;
    }
}
