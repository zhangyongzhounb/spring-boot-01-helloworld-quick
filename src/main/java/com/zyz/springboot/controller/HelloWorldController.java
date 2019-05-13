package com.zyz.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yongzhou.zhang on 2019/5/13.
 */
@ResponseBody
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }
}
