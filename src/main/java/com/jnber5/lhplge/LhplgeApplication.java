package com.jnber5.lhplge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LhplgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LhplgeApplication.class, args);
	}

}
