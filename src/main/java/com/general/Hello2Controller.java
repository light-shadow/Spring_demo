package com.general;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by general on 2017/8/13.
 */

@RestController
public class Hello2Controller {

    @RequestMapping("/hello2c")
    public String c2()
    {
        return "this is the second controller";
    }
}
