package com.jiely.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 *
 * Created by Administrator on 2017/2/18.
 */
@Controller
@RequestMapping("/template")
public class TemplateController {

    @RequestMapping("/thymeleaf")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/hello")
    public String hello2(Map<String,Object> map){
        map.put("hello","hello jiely");
        return "hello";
    }

    @RequestMapping("/nimei")
    public String nimei(){

        return "nimei";
    }

    @RequestMapping("/freeFtl")
    public String freeFtl(){

        return "freeFtl";
    }
}
