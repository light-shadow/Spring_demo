package com.general;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by general on 2017/8/13.
 */
public class Demo {

    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date createTime;
    private int id;
    private String name;
    private String gender;

    @JSONField(serialize = false)
    private int grades;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public int getGrades() {
        return grades;
    }
}
