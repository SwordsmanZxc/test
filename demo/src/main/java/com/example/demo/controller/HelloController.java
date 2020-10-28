package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "这是你第一个SpringBoot程序。";
    }
}
