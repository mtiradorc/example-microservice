package com.gian.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
//@EnableEurekaClient
public class RegistryServiceApplication
{
	public static void main(String[] args) {
		SpringApplication.run(RegistryServiceApplication.class, args);
	}
}
