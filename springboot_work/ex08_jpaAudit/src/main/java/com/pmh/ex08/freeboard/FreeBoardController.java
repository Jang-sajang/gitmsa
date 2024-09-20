package com.pmh.ex08.freeboard;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.matcher.StringMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
public class FreeBoardController {
    private final FreeBoardRepository freeBoardRepository;

    @GetMapping
    public ResponseEntity<FreeBoardResponsePageDto> findALl(@RequestParam(name = "pageNum", defaultValue = "0") int pageNum
                                                                , @RequestParam(name = "size" , defaultValue = "5") int size){
        Sort sort = Sort.by(Sort.Direction.DESC,"idx");

        Pageable pageable = PageRequest.of(pageNum, size, sort);

        //Page List
        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);

        System.out.println("elements = "+page.getTotalElements());
        System.out.println("pages = "+page.getTotalPages());

        FreeBoardResponsePageDto freeBoardResponsePageDto =
                new ModelMapper()
                        .map(page, FreeBoardResponsePageDto.class);

        List<FreeBoardResponseDto> list = new ArrayList<>();

        for (FreeBoard freeBoard : freeBoardResponsePageDto.getContent()){
            FreeBoardResponseDto freeBoardResponseDto
                    = new ModelMapper().map(freeBoard, FreeBoardResponseDto.class);

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");

            freeBoardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
            freeBoardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

            list.add(freeBoardResponseDto);
        }
        freeBoardResponsePageDto.setList(list);

        return ResponseEntity.ok(freeBoardResponsePageDto);
    }
    @PostMapping
    public ResponseEntity<FreeBoard> save( @RequestBody FreeBoardReqDto freeBoardReqDto){

        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto,FreeBoard.class);
        freeBoardRepository.save(freeBoard);
        return ResponseEntity.status(200).body(freeBoard);
    }
}