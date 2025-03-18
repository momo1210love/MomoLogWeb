package com.example.MomoLogWeb;

import com.example.MomoLogWeb.model.repository.CategoryRepository;
import com.example.MomoLogWeb.model.repository.StoreInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MomoLogWebApplication {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	StoreInfoRepository StoreInfoRepository;

	@RequestMapping("/")
	String home() {
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(MomoLogWebApplication.class, args);
	}
	@Bean
	public CommandLineRunner run() {
		return  (args -> {
			//動作確認用
			System.out.println(categoryRepository.findAll());
			System.out.println(StoreInfoRepository.findAll());
		});
	}
}
