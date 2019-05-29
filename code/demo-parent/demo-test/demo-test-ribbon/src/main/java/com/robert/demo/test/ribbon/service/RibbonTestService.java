package com.robert.demo.test.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RibbonTestService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "failBack")
    public String test(String name, int age) {
        return restTemplate.getForObject("http://DEMO-REBERT-EURAKA-CLIENT/user?name=" + name + "&age=" + age, String.class);
    }

    public String failBack(String name, int age) {
        return "call service failed, this message from hystrix";
    }
}
