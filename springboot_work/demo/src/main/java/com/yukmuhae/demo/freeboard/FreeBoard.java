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
    private String title;

    private String content;

    private LocalDateTime regDate;



}
