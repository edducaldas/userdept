package com.devsuperior.userdept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UserdeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserdeptApplication.class, args);
	}
	@GetMapping("/")
	public String index(){
		return "Olá Mundo!";
	}
}
