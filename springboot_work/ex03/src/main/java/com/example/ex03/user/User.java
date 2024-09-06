package com.example.ex03.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/*
@Configuration : 객체 담는 통
@Bean : 객체
@Component : 이것도 객체
@ComponentScan : 패키지 내용 일거엇 객체 주입해줌
@Autowired : new 예약어 안쓰고 객체 자동 할당
private final -> @RequiredArgsConstructor : 객체 자동할당

@Entity : 테이블이라는 뜻
@Table : table 이름 바꾸기
@Id : 기본키 설정
 */

@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrement 설정
    private Long idx;

    private String name;
    private int age;

    private String email;
    private String password;

    private LocalDateTime wdate;
    //JPA CLASS -> table CREATE가 된다
}
