package com.pmh.ex08.freeboard;

import com.pmh.ex08.user.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class FreeBoardResponseDto {
    private Long idx;

    private String title;
    private String content;


    private User user;


    private String creauthor;


    private String modauthor;


    private String  regDate;


    private String  modDate;


    private int viewCount;
}
