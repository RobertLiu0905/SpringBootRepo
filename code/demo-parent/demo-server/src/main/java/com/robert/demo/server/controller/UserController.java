package com.robert.demo.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    Environment environment;

    @GetMapping(name = "/user")
    @ResponseBody
    public String test(String name, int age) {
        return "Hi! My name is " + name +", I am "+ age +" years old!" + " My client port is : " + environment.getProperty("server.port");
    }
}
