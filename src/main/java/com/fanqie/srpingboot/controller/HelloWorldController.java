package com.fanqie.srpingboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuh
 * @create 2019-11-13 5:35
 */
@Controller
public class HelloWorldController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){

        return "Hello world!";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("success","成功！！！");
        map.put("success2","<h1>成功<h1/>");
        map.put("users", Arrays.asList("zhangshan","lisi","wangwu"));
        return "success";
    }

}
