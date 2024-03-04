package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@EnableEurekaServer
@SpringBootApplication
public class Step07SpringCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step07SpringCloudServerApplication.class, args);
	}

}
	