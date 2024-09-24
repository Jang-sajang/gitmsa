package com.yukmuhae.demo.freeboard;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.query.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;

    @GetMapping
    // http://localhost:8080/freeboard?pageNum=1
    private ResponseEntity<List<FreeBoardResDto>> selectAll(@RequestParam(name = "pageNum", defaultValue = "0") int pageNum
                                                            ,@RequestParam(name = "size", defaultValue = "5") int size) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(pageNum, size, sort);

        //Page list
        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);
    }

    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody FreeBoardReqDto freeBoardReqDto) {
        FreeBoard freeBoard = new FreeBoard();
        freeBoard.setF_title(freeBoardReqDto.getF_title());
        freeBoard.setF_body(freeBoard.getF_body());
        freeBoard.setF_password(freeBoard.getF_password());
        freeBoard.setF_timestamp(LocalDateTime.now());

        freeBoardRepository.save(freeBoard); // 연속성


        return ResponseEntity.ok("정상적으로 게시글이 등록됐습니다");
    }

    @GetMapping("list")
    public void list() {

    }

}
