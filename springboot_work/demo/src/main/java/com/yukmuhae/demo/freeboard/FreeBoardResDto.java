package com.yukmuhae.demo.freeboard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FreeBoardResDto {

    @JsonIgnore
    private Long F_idx;

    private String title;
    private String content;
    private LocalDateTime regDate;
}
