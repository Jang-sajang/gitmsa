package com.example.ex04;

import com.example.ex04.obj.AA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex04Application {

	@Autowired
	public AA aa;

	public static void main(String[] args) {
		SpringApplication.run(Ex04Application.class, args);
	}

}
