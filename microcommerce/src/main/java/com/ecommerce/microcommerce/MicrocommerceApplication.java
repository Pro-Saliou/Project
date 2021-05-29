package com.ecommerce.microcommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.ecommerce.microcommerce.web.controller","com.ecommerce.microcommerce.dao"})
@EnableSwagger2

public class MicrocommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrocommerceApplication.class, args);
	}

}
