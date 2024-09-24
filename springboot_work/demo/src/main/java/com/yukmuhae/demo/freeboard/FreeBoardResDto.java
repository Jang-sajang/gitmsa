package com.yukmuhae.demo.freeboard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FreeBoardResDto {

    @JsonIgnore
    private Long F_idx;

    private String f_title;

    private String f_body;  //

    private String f_nickname;

    private String f_password;

    private LocalDateTime f_timestamp; // regDate

    private int f_avail;    // 논리적 삭제 1/0
}
