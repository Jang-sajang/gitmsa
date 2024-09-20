package com.pmh.ex09.freeboard;

import com.pmh.ex09.user.User;
import lombok.Data;

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
