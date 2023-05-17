package com.springboot.app.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioSecurityApplication.class, args);
	}
}
