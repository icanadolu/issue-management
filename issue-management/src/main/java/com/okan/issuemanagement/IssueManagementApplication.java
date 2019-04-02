package com.okan.issuemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;

@SpringBootApplication
public class IssueManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueManagementApplication.class, args);
	}
	
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
