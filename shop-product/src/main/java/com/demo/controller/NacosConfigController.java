package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
//@RefreshScope//动态刷新的注解
public class NacosConfigController {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Value("${config.appName}")
    private String appName;

    @Value("${config.env}")
    private String env;


    @RequestMapping("/test-config1")
    public String testConfig1() {
        return applicationContext.getEnvironment().getProperty("config.appName");
    }


    @RequestMapping("/test-config2")
    public String testConfig2() {
        return appName;
    }

    @RequestMapping("/test-config3")
    public String testConfig3() {
        return env;
    }
}
