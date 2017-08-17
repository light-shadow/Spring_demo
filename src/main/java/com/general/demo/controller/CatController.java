package com.general.demo.controller;

import com.general.demo.bean.Cat;
import com.general.demo.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by general on 2017/8/14.
 */

@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save(){
        Cat cat = new Cat();
        cat.setCatAge(11);
        cat.setCatName("Andy");
        catService.save(cat);
        return "save ok!";
    }

    @RequestMapping("/delete")
    public String delete()
    {
        catService.delete(2);
        return "delete ok!";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }

    @RequestMapping("/findBycatName")
    public Cat findBycatName(String catName)
    {
        return catService.findByCatName(catName);
    }

    @RequestMapping("/findMyCat")
    public Cat findMyCat(String catName)
    {
        return catService.findByCatName2(catName);
    }

    @RequestMapping("/selectByName")
    public Cat selectByName(String catName)
    {
        return catService.selectByName(catName);
    }
}
