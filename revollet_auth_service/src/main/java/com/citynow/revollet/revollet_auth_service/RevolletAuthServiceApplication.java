package com.citynow.revollet.revollet_auth_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RevolletAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevolletAuthServiceApplication.class, args);
	}

}
