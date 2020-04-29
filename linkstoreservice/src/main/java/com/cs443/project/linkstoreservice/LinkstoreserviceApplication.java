package com.cs443.project.linkstoreservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LinkstoreserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkstoreserviceApplication.class, args);
	}


}

