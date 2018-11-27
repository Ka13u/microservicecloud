package com.code.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8103_App {
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8103_App.class, args);
	}
}
