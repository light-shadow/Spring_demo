package com.general.demo.service;

import com.general.demo.bean.Cat;
import com.general.demo.dao.catDao;
import com.general.demo.repository.Cat2Repository;
import com.general.demo.repository.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by general on 2017/8/14.
 */

@Service
public class CatService {
    /*
    save, update, delete 需要事务绑定，使用@Transactional进行事务的绑定
    参数Cat的实例
     */

    @Resource
    private CatRepository catRepository;

    @Resource
    private Cat2Repository cat2Repository;

    @Resource
    private catDao catDao;


    @Transactional
    public void save(Cat cat)
    {
        catRepository.save(cat);
    }

    @Transactional
    public void delete(int id)
    {
        catRepository.delete(id);
    }

    @Transactional
    public Iterable<Cat> getAll()
    {
        return catRepository.findAll();
    }

    public Cat findByCatName(String catName)
    {
        return cat2Repository.findByCatName(catName);
    }

    public Cat findByCatName2(String catName)
    {
        System.out.println("call the findByCatName2");
        return cat2Repository.findMyCatName(catName);
    }

    public Cat selectByName(String catName)
    {
        return catDao.selectByName(catName);
    }
}
