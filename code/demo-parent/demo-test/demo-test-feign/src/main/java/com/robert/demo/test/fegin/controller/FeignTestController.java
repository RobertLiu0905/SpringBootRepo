package com.robert.demo.test.fegin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.robert.demo.test.fegin.service.FeignTestService;

@RestController
public class FeignTestController {

    @Autowired
    FeignTestService feignService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String feignTest(String name, int age){
        return feignService.feignTest(name, age);
    }
}
