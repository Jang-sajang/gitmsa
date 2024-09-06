package com.example.ex03.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController // url 맵하는 클래스
@RequestMapping("user") // 주소줄에 user로 시작
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<User> select(){
        return userRepository.findAll();
    }
    @PostMapping("insert")
    public String insert(@RequestBody User user){
        System.out.println("실행");
        // save = insert 실행
//        User user = User.builder()
//                .name("아르메스")
//                .age(19)
//                .email("aaa@naver.com")
//                .password("password")
//                .wdate(LocalDateTime.now())
//                .build();
        userRepository.save(user);
        return "ok";
    }
}
