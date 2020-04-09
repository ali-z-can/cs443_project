package com.cs443.project.userpastlinkanalyticsarrangementservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class UserpastlinkanalyticsarrangementserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserpastlinkanalyticsarrangementserviceApplication.class, args);
	}
	@Bean
	public Sampler defaultSampler(){return Sampler.ALWAYS_SAMPLE;}

}
