package com.code.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer81_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer81_App.class, args);
	}
}
