package com.nagarro.usermanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages= {"com.nagarro"})
public class UserManagementServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UserManagementServiceApplication.class, args);
	}
}