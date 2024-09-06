package com.example.ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

import static org.springframework.web.server.adapter.WebHttpHandlerBuilder.applicationContext;

@SpringBootApplication
public class Ex01 {

    public static void main(String[] args) {
     ApplicationContext applicationContext = SpringApplication.run(Ex01.class, args);


    }
}