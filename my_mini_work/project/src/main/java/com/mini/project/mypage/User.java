package com.mini.project.mypage;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(length = 20)
    private String name;

    @Column(length = 15)
    private String phoneNum;

    @Column(length = 50)
    private String email;
}
