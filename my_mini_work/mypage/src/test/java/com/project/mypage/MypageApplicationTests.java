package com.project.mypage;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

//@SpringBootTest
class MypageApplicationTests {

	@BeforeEach
	void beforeEach(){
		System.out.println("각 테스트 실험 전에 발생");
	}
	@AfterEach
	void afterEach(){
		System.out.println("각 테스트 실험 후에 발생");
	}
	//BeforeAll, AfterAll도 있음 -> 테스트 전, 후에 실행

	@DisplayName("간단한 산술연산")
	@Test
	void contextLoads() {
		int a = 10;
		int b = 20;
		int sum = 30;

//		Assertions.assertEquals(sum, a+b+1);

	}

	@DisplayName("다른 Assertions로 산술연산 테스트")
	@Test
	void basicTest() {
		int a = 10;
		int b = 20;
		int sum = 30;
//		Assertions.assertThat(a+b).isEqualTo(sum);
//		Assertions.assertThat(a).isEqualTo(b);
	}

	@DisplayName("리스트 data 테스트")
	@Test
	void listTest(){
		//given
		List<String> list = Arrays.asList("John","Jane","Joe");

		//when list 테스트..
		Assertions.assertThat(list)
				.hasSize(3)
				.contains("John")
				.doesNotContain("Jack");
	}
	@Test
	void testException(){
		Throwable throwable = Assertions.catchThrowable(() -> {
			throw new IllegalArgumentException("Invalid Args");
		});

		Assertions.assertThat(throwable)
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessageContaining("Invalid");
	}
}
