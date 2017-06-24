package com.tao.utils.swagger;


import java.io.Serializable;

/**
 * @Description 返回的基类
 *
 * Created by zhangantao on 2017/6/23.
 */
public class BaseReuslt implements Serializable {


    private int code;//返回状态码

    private String message;//返回信息

    private Object resultData;//返回的数据内容

    public BaseReuslt(){}

    public BaseReuslt(int code,String message){
        this.code=code;
        this.message=message;
    }

    public BaseReuslt(String message,Object resultData){
        this.message=message;
        this.resultData=resultData;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    @Override
    public String toString() {
        return "BaseReuslt{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", resultData=" + resultData +
                '}';
    }
}
