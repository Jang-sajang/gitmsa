package com.pmh.ex06;

import com.pmh.ex06.Ex06Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

//IOC 컨테이너 생성
//@SpringBootTest
class Ex06ApplicationTests {


	@Test
	void contextLoads() {
		String[] str = {"10입니다","20입니다","30입니다"};
		Arrays.stream(str).forEach(System.out::println);
		Arrays.stream(str).reduce("", (s, s2) -> s+s2);
		Arrays.stream(str).reduce("", (s, s2) -> {return s+s2; });
	}

}
