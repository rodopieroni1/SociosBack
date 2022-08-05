package com.Socios.socios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.DemoApplication"})
public class SociosApplication {
	public static void main(String[] args) {
		SpringApplication.run(SociosApplication.class, args);
	}

}
