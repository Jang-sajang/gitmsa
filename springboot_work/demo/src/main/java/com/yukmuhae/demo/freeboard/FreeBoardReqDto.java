package com.yukmuhae.demo.freeboard;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
public class FreeBoardReqDto {
    private Long F_idx;

    @NotNull
    private String title;
    @NotNull
    private String content;
    private LocalDateTime regDate;

}
