package com.develop.socket_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SocketApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocketApiApplication.class, args);
	}

}
