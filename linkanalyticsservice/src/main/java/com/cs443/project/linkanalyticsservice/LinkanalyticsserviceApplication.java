package com.cs443.project.linkanalyticsservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class LinkanalyticsserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkanalyticsserviceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler(){return Sampler.ALWAYS_SAMPLE;}

}
