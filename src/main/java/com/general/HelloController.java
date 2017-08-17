package com.general;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by general on 2017/8/13.
 */

@RestController
public class HelloController {

    /*
    在这里建立请求映射
     */
    @RequestMapping("/")
    public String hello()
    {
        return "hello-2016-12-10! :)";
    }

    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Richard");
        demo.setGender("male");
        demo.setCreateTime(new Date());
        demo.setGrades(99);
        return demo;
    }

    @RequestMapping("/hello")
    public String hello1()
    {
        return "hello-2017-8-13";
    }

    @RequestMapping("/hello4")
    public String hello3()
    {
        return "hello-2018-9-22";
    }

    @RequestMapping("/id")
    public String f()
    {
        return "your id card is 008";
    }

}
