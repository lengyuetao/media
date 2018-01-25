package com.tao.controller.api;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangantao on 2017/6/24.
 */
@RestController
public class UserInfoCotroller {

    @RequestMapping(value="/userInfo",method = RequestMethod.GET)
    public String getUserInfo(){

        JSONObject json=new JSONObject();
        json.put("name","aaa");
        json.put("age",27);
        json.put("address","shenzen");

        return json.toJSONString();
    }
}
