package com.tao.entity.system;

import java.util.Date;

/**
 * Created by DELL on 2017/9/7.
 */
public class SystemLog {
    /**
     * id
     */
    private Long id;
    /**
     * 日志名称
     */
    private String logName;
    /**
     * 内容
     */
    private String content;
    /**
     * 作者
     */
    private String author;
    /**
     * 是否删除
     */
    private int isDel;
    /**
     * 添加时间
     */
    private Date addTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "SystemLog{" +
                "id=" + id +
                ", logName='" + logName + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", isDel=" + isDel +
                ", addTime=" + addTime +
                '}';
    }
}
