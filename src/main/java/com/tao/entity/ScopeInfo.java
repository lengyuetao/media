package com.tao.entity;

import java.util.Date;

/**
 * Created by zhangantao on 2017/4/24.
 */
public class ScopeInfo {
    private Long id;
    private Long userId;
    private int score;
    private Date addTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "ScopeInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", score=" + score +
                ", addTime=" + addTime +
                '}';
    }
}
