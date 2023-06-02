package com.amcon.springjsontabledemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Library APIs", version = "1.0", description = "Library Management Apis"))
public class SpringJsonTableDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJsonTableDemoApplication.class, args);
	}

}
