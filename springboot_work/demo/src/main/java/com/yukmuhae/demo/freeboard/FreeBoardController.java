package com.yukmuhae.demo.freeboard;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.query.Page;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;

//    @GetMapping
//    // http://localhost:8080/freeboard?pageNum=1
//    private ResponseEntity<List<FreeBoardResDto>> selectAll(@RequestParam(name = "pageNum", defaultValue = "0") int pageNum
//                                                            ,@RequestParam(name = "size", defaultValue = "5") int size) {
//        Sort sort = Sort.by(Sort.Direction.DESC, "id");
//        Pageable pageable = PageRequest.of(pageNum, size, sort);
//
//        //Page list
//        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);
//    }

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

    // localhost:8080/freeboard/list
    // /freeboard?pageNum=0~ 개수
    @GetMapping
    public void findAll(@RequestParam(name = "pageNum") Long pageNum) {
        // 페이지네이션 자체가 좀 어렵긴해요...

    }


    @GetMapping("view/{idx}")
    public ResponseEntity<FreeBoardResDto> list(@PathVariable(name = "idx") Long idx) {

        // select * from free_board where idx = ?
        FreeBoard freeboard = freeBoardRepository.findById(idx)
                .orElseThrow(() -> new RuntimeException("없는 게시글입니다"));


        // 리턴할 때(프론트로 응답할 때 엔티티를 바로 주면 큰일난다
        // N + 1 문제 (간단하게 말하면 연관된 객체까지 다 끌고 온다
        // User freeboard
        // 나는 단순히 user 하나만 조회를 하고싶은데 이 유저가 쓴 게시글까지 몽땅 조회되는 상황
        // 이걸 피하기 위해서 DTO로 따로 정보를 담아론트로 보내서 프준다
        FreeBoardResDto freeBoardResDto = new FreeBoardResDto();
        freeBoardResDto.setF_avail(freeboard.getF_avail());
        freeBoardResDto.setF_body(freeboard.getF_body());
        //,,,
        return ResponseEntity.ok(freeBoardResDto);

    }

}
