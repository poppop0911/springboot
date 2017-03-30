package com.zhicloud.mig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApiApplication.class, args);

		//http://localhost:8080/druid
		//http://localhost:8080/swagger-ui.html
	}
}
