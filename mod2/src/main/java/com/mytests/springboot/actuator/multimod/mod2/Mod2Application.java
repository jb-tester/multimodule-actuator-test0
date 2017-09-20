package com.mytests.springboot.actuator.multimod.mod2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Mod2Application {
	@Bean
	public ListEndpoints listEndpoints() {
		return new ListEndpoints();
	}
	public static void main(String[] args) {
		SpringApplication.run(Mod2Application.class, args);
	}
}

