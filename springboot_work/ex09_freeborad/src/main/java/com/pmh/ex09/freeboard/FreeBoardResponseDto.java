package com.pmh.ex09.freeboard;

import com.pmh.ex09.user.User;
import lombok.Data;

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
