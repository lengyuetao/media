package com.tao.entity;

import java.util.Date;

/**
 * Created by DELL on 2017/9/26.
 */
public class Article {
    /**
     * id
     */
    private Integer id;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章类型id
     */
    private int typeId;
    /**
     * 作者
     */
    private String author;
    /**
     * 内容
     */
    private String content;
    /**
     * 添加时间
     */
    private Date addTime;
    /**
     * 状态
     */
    private int isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", typeId=" + typeId +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", addTime=" + addTime +
                ", isDel=" + isDel +
                '}';
    }
}
