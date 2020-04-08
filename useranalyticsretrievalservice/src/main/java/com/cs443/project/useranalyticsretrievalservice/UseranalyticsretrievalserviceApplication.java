package com.cs443.project.useranalyticsretrievalservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients("com.cs443.project.useranalyticsretrievalservice")
@SpringBootApplication
public class UseranalyticsretrievalserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseranalyticsretrievalserviceApplication.class, args);
	}


	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
