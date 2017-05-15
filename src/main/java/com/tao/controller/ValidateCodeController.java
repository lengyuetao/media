package com.tao.controller;

import com.alibaba.fastjson.JSONObject;
import com.tao.utils.validate.ValidateCode;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by zhangantao on 2017/5/10.
 */
@Controller
@RequestMapping(value = "/validate")
public class ValidateCodeController {
    Logger log=Logger.getLogger(ValidateCodeController.class);

    @RequestMapping(value = "code")
    public String validateCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //设置响应类型的为图片格式
        response.setContentType("image/jpeg");
        //禁止图像缓存
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setDateHeader("Expires",0);


        HttpSession session=request.getSession();

        ValidateCode code=new ValidateCode(120,40,5,100);
        session.setAttribute("code",code.getCode());
        code.write(response.getOutputStream());

        return  null;
    }

    @RequestMapping("/examine")
    @ResponseBody
    public String validate(HttpServletRequest request,@RequestParam(value="code",required = true)String code){
        JSONObject json=new JSONObject();

        HttpSession session=request.getSession();
        String sessionCode=session.getAttribute("code").toString();
        if(!StringUtils.equalsIgnoreCase(sessionCode,code)){
            log.error("验证不正确");
            json.put("code",3);
            json.put("message","code is error");
        }else{
            json.put("code",1);
            json.put("message","code is ok");
        }

        return  json.toString();
    }

}
