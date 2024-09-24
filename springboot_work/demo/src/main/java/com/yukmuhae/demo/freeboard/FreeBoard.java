package com.yukmuhae.demo.freeboard;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity // 연속성 컨테스트가 FreeBoard를 본다?
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FreeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "f_idx")
    private Long id;

    @Column(nullable = false)
    private String f_title;

    private String f_body;  //

    private String f_nickname;

    private String f_password;

    private LocalDateTime f_timestamp; // regDate

    private int f_avail;    // 논리적 삭제 1/0

}
