package com.employee.page;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AssessmentServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentServerApplication.class, args);
	}

}
