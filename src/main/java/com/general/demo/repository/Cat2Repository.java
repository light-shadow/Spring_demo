package com.general.demo.repository;

import com.general.demo.bean.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 * Created by general on 2017/8/15.
 */
public interface Cat2Repository extends Repository<Cat, Integer> {
    /*
    1、查询方法以find | read | get开头
    2、涉及查询条件时，条件的属性用条件关键字连接，要注意的是条件属性以首字母大写。

     /*
      根据cat的name进行查询
       */
    // 根据cat的name进行查询
    public Cat findByCatName(String catName);

    // 如何比编写JPQL语句
    /*
    hibernate HQL语句
     */

    @Query("from Cat where catName=:cn")
    public Cat findMyCatName(@Param("cn")String catName);
}
