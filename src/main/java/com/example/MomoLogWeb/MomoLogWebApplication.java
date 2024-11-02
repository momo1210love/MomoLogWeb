package com.example.MomoLogWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MomoLogWebApplication {
	@RequestMapping("/")
	String home() {
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(MomoLogWebApplication.class, args);
	}

}
