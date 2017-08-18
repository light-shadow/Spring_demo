package com.general;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by general on 2017/8/18.
 * 可以同时支持thymeleaf和freemaker
 */
@Controller
@RequestMapping("/templates")
public class TemplateController {

    @RequestMapping("/hello")
    public String hello(Map<String, Object> map)
    {
        map.put("name", "General");
        return "hello";
    }

    @RequestMapping("/helloftl")
    public String hello1(Map<String, Object> map)
    {
        map.put("name", "General");
        return "hello1";
    }

}
