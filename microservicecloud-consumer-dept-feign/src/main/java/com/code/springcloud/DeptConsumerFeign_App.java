package com.code.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.code.springcloud")
public class DeptConsumerFeign_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumerFeign_App.class, args);
	}
}
