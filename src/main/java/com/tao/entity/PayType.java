package com.tao.entity;

import java.util.Date;

/**
 * Created by zhangantao on 2017/4/24.
 */
public class PayType {
    private Long id;
    private String payName;
    private Integer payMoney;
    private Date addTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "PayType{" +
                "id=" + id +
                ", payName='" + payName + '\'' +
                ", payMoney=" + payMoney +
                ", addTime=" + addTime +
                '}';
    }
}
