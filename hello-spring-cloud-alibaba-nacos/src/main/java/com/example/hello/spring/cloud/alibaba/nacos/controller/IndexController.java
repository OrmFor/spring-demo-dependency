package com.example.hello.spring.cloud.alibaba.nacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "success";
    }
}
