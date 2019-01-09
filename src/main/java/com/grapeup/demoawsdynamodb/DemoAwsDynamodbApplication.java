package com.grapeup.demoawsdynamodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
public class DemoAwsDynamodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAwsDynamodbApplication.class, args);
	}

}

