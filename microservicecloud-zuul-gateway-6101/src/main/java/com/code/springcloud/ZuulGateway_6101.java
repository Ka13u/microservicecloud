package com.code.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by KaBu on 2018/11/28.
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway_6101 {
    public static void main(String[] args){
        SpringApplication.run(ZuulGateway_6101.class,args);
    }
}
