package com.example.mathzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.mathzone"})
public class MathzoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathzoneApplication.class, args);
	}

}
