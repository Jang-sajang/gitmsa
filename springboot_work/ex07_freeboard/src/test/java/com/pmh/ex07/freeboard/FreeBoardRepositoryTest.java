package com.pmh.ex07.freeboard;

import com.pmh.ex07.user.User;
import com.pmh.ex07.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FreeBoardRepositoryTest {

    @Autowired
    FreeBoardRepository freeBoardRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    void insertTest() {

        User user = User.builder()
                        .name("홍길동")
                        .age(20)
                        .email("dafjdfaj@nashah.com")
                        .password("password")
                        .build();

//        userRepository.save(user); // Cascade 대신 씀

        FreeBoard freeBoard = FreeBoard.builder()
                        .title("제목")
                        .content("내용")
                        .user(user)
                        .build();
        freeBoardRepository.save(freeBoard);
    }

    @Test
    void selectTest(){
        List<FreeBoard> list = freeBoardRepository.findAll();
        list.stream().forEach(System.out::println);
    }

    void deleteTest(){
        freeBoardRepository.deleteById(1l);
    }

    @Test
    void updateTest() {
        User user = User.builder()
                .name("홍길동")
                .age(20)
                .email("dafjdfaj@nashah.com")
                .password("password")
                .build();

//        userRepository.save(user); // Cascade 대신 씀

        FreeBoard freeBoard = FreeBoard.builder()
                .title("제목")
                .content("내용")
                .user(user)
                .build();
        freeBoardRepository.save(freeBoard);
    }
}