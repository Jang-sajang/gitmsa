package com.example.ex03;

import com.example.ex03.user.User;
import com.example.ex03.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Ex03ApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
		System.out.println("실행");
		// save = insert 실행
		User user = User.builder()
				.name("호이이")
				.age(19)
				.email("aaa@naver.com")
				.password("password")
				.wdate(LocalDateTime.now())
						.build();
		userRepository.save(user);
	}
	@Test
	void selctTest(){
		userRepository.findAll()
				.stream()
				.forEach(System.out::println);
	}

}
