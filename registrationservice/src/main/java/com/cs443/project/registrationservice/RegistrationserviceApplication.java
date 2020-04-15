package com.cs443.project.registrationservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RegistrationserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationserviceApplication.class, args);
	}


	public Sampler defaultSampler(){return Sampler.ALWAYS_SAMPLE;}
}
