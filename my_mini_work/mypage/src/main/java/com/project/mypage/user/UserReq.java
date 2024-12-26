package com.project.mypage.user;

import lombok.Data;

@Data
public class UserReq {
    private long id;
    private String name;
    private String number;
    private String email;
}
