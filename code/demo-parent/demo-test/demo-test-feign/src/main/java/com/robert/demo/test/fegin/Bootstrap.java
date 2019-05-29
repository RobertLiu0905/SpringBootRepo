package com.robert.demo.test.fegin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableFeignClients
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value = {"com.robert.demo.test.fegin.controller", "com.robert.demo.test.fegin.service"})
public class Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
