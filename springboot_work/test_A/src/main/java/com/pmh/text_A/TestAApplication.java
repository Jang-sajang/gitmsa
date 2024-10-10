package com.pmh.text_A;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class TestAApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext
				= SpringApplication.run(TestAApplication.class, args);

		Arrays.stream(applicationContext.getBeanDefinitionNames())
				.forEach(System.out::println);
	}

}
