package com.yukmuhae.demo.freeboard;


import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
public class FreeBoardReqDto {
    private Long F_idx;

    private String f_title;

    private String f_body;  //

    private String f_nickname;

    private String f_password;

    private LocalDateTime f_timestamp; // regDate

    private int f_avail;    // 논리적 삭제 1/0

}
