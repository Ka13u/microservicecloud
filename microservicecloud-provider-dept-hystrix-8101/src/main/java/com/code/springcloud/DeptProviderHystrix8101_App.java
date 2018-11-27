package com.code.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient     //Eureka客户端
@EnableCircuitBreaker	//熔断器
public class DeptProviderHystrix8101_App {
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProviderHystrix8101_App.class, args);
	}
}
