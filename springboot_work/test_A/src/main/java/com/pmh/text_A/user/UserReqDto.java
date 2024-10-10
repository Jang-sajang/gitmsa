package com.pmh.text_A.user;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

// 프론트 오는 파라메타의 검사..
@Data
public class UserReqDto {


    private Long id;

    private String nickname;

    private String password;

    private String name;

    @NotEmpty
    private String email;

    @NotEmpty
    private String phoneNumber;

    private boolean isAdmin;

}
