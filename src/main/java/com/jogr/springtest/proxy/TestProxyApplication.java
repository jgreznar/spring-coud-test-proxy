package com.jogr.springtest.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class TestProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestProxyApplication.class, args);
    }

}
