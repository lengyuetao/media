package com.tao.entity;

import java.util.Date;

/**
 * Created by zhangantao on 2017/4/24.
 */
public class OperatorLog {
    private  Long id;
    private  String userName;
    private  String operatorTypes;
    private  String descripes;
    private  Date addTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOperatorTypes() {
        return operatorTypes;
    }

    public void setOperatorTypes(String operatorTypes) {
        this.operatorTypes = operatorTypes;
    }

    public String getDescripes() {
        return descripes;
    }

    public void setDescripes(String descripes) {
        this.descripes = descripes;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "OperatorLog{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", operatorTypes='" + operatorTypes + '\'' +
                ", descripes='" + descripes + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
