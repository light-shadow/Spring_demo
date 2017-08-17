package com.general.demo.dao;

import com.general.demo.bean.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by general on 2017/8/16.
 */
/*
1、使用@Repository 持久化一个对象
2、定义一个rowmapper对象
3、进行查询
 */

@Repository
public class catDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public Cat selectByName(String catName)
    {
        String sql = "select * from cat where cat_name=?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
        Cat cat = jdbcTemplate.queryForObject(sql, new Object[]{catName}, rowMapper);
        return cat;
    }

}
