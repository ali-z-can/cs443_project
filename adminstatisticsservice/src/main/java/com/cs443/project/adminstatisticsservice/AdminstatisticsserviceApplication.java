package com.cs443.project.adminstatisticsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableFeignClients("com.cs443.project.adminstatisticsservice")
@SpringBootApplication
public class AdminstatisticsserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminstatisticsserviceApplication.class, args);
	}

}
