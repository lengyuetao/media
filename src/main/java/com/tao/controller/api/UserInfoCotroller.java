package com.tao.controller.api;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangantao on 2017/6/24.
 */
@Api(basePath="/",value="用户信息",position = 1)
@RestController
public class UserInfoCotroller {

    @ApiOperation(value= "用户详细信息接口",httpMethod = "GET",produces = "application/json; charset=utf-8")
    @RequestMapping(value="/userInfo",method = RequestMethod.GET)
    public String getUserInfo(){

        JSONObject json=new JSONObject();
        json.put("name","aaa");
        json.put("age",27);
        json.put("address","shenzen");

        return json.toJSONString();
    }
}
