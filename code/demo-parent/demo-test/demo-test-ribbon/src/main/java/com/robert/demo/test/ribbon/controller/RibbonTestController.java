package com.robert.demo.test.ribbon.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.robert.demo.test.ribbon.service.RibbonTestService;

@RestController
public class RibbonTestController {

    @Autowired
    RibbonTestService service;

    @GetMapping(value = "/user")
    @ResponseBody
    public String testLoadBalance(String name, int age) {
        return service.test(name, age);
    }
}
