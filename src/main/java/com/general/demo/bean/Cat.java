package com.general.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** 1、 如何持久化： 使用@Entity进行注解，当JPA检测
 * 到我们实体类中有注解的时候就会在对应的数据库中生成对应的数据表
 *  2、 如何指定主键以及设置主键的生成策略：通过@Id进行注解，标明主键，
 *  使用@GeneratedValue(strategy = GenerationType.AUTO)指定自增id， mysql默认的是自增的
 * Created by general on 2017/8/14.
 */

@Entity
public class Cat {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String catName;
    private int catAge;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }
}
