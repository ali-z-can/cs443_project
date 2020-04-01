package com.cs443.project.netflixeurekanaimgserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetflixeurekanaimgserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixeurekanaimgserverApplication.class, args);
	}

}
