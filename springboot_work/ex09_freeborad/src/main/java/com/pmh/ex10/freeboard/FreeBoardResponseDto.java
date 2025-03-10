package com.pmh.ex10.freeboard;

import com.pmh.ex10.user.User;
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
