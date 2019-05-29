package com.robert.demo.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.robert.demo.server.controller")
public class SpringAutoConfiguration {
}
