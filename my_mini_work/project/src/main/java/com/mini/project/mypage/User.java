package com.mini.project.mypage;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {


    @Id
    private Long id;
    private String name;
    private String email;
}
