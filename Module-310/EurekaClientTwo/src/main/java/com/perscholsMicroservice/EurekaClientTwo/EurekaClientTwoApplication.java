package com.perscholsMicroservice.EurekaClientTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientTwoApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaClientTwoApplication.class, args);
		System.out.println("******************Eureka Client-Two Application*****************************");
	}

}
