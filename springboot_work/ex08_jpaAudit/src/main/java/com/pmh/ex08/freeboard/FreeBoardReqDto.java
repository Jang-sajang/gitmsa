package com.pmh.ex08.freeboard;

import com.pmh.ex08.user.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class FreeBoardReqDto {

    private Long idx;
    private String title;
    private String content;

    private User user;
    private String creAuthor;
    private String modAuthor;
    private LocalDateTime regDate;
    private LocalDateTime modDate;

    private int viewCount;
}
