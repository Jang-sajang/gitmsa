package com.yukmuhae.demo.freeboard;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;

    @GetMapping
    // http://localhost:8080/freeboard?pageNum=1
    private ResponseEntity<List<FreeBoardResDto>> selectAll(@RequestParam(name = "pageNum") int pageNum ){

        return ResponseEntity.ok("")
    }
    @GetMapping
    게시글 1개 조회

    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody FreeBoardReqDto freeBoardReqDto) {
        FreeBoard freeBoard = new FreeBoard();
        freeBoard.setTitle(freeBoardReqDto.getTitle());
        freeBoard.setContent(freeBoard.getContent());
        freeBoard.setRegDate(LocalDateTime.now());
        freeBoardRepository.save(freeBoard); // 연속성


        return ResponseEntity.ok("정상적으로 게시글이 등록됐습니다");
    }

    @GetMapping("list")
    public void list() {

    }

}
