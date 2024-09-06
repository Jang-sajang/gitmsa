package com.example.ex01.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링객체 담는 통 정의 하는 것
@ComponentScan(basePackages = "com.example.ex01.member") // 어떤 디렉토리를 읽어서 객체 주입 해달라
public class Myconf1 {
}
