package com.tao.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 所有controller返回的类
 *
 **/
public class WebResult implements Serializable {
    private String code;
    private String msg;
    private Map<String,Object> result = new HashMap<>();

    public WebResult(String code){
        this.code = code;
        this.msg = WebMessage.getMsg(code);
    }

    public WebResult(String code,Object obj){
        this.code = code;
        this.msg = WebMessage.getMsg(code);
        this.result.put("data",obj);
    }

    public WebResult(String code,String msg,Object obj){
        this.code = code;
        this.msg = msg;
        this.result.put("data",obj);
    }

    public WebResult put(String key,Object obj){
        this.result.put(key,obj);
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }
}
