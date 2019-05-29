package com.robert.demo.test.fegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "demo-robert-eureka-client")
public interface FeignTestService {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String feignTest(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age);

}
