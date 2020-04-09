package com.cs443.project.userpastlinkanalyticsretrievalservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
public class UserpastlinkanalyticsretrievalserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserpastlinkanalyticsretrievalserviceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}

}
