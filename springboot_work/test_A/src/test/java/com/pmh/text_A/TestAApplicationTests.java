package com.pmh.text_A;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

//IOC 컨테이너 생성
//@SpringBootTest
class TestAApplicationTests {


	@Test
	void contextLoads() {
		String[] str = {"10입니다","20입니다","30입니다"};
		Arrays.stream(str).forEach(System.out::println);
		Arrays.stream(str).reduce("", (s, s2) -> s+s2);
		Arrays.stream(str).reduce("", (s, s2) -> {return s+s2; });
	}

}
