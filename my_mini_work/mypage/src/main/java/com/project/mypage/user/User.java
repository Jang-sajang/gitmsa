package com.project.mypage.user;

import jakarta.persistence.*;

@Entity
@Table(name = "test")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;

    @Column(length = 50)
    private String email;
}