package com.cs443.project.linkdeletionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableDiscoveryClient
@EnableFeignClients("com.cs443.project.linkdeletionservice")
@SpringBootApplication
public class LinkdeletionserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkdeletionserviceApplication.class, args);

	}

}
