package com.tao.entity;

import java.util.Date;

/**
 * Created by zhangantao on 2017/4/24.
 */
public class PayInfo {
    private Long id;
    private String payType;
    private String payMoney;
    private String userId;
    private Date addTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "PayInfo{" +
                "id=" + id +
                ", payType='" + payType + '\'' +
                ", payMoney='" + payMoney + '\'' +
                ", userId='" + userId + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
