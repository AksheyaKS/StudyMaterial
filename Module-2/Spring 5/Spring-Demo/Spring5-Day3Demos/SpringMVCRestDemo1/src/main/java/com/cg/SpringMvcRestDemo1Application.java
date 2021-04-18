package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg")
public class SpringMvcRestDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcRestDemo1Application.class, args);
		System.out.println("Strted at 8083");
	}

}
