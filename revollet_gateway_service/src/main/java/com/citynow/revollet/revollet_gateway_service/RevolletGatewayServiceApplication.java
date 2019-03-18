package com.citynow.revollet.revollet_gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class RevolletGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevolletGatewayServiceApplication.class, args);
	}

}
