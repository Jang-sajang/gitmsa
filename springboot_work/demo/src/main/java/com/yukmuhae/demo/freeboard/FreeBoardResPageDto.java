package com.yukmuhae.demo.freeboard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardResPageDto {

    @JsonIgnore
    private List<FreeBoard> content; //content?? f_body??

    private List<FreeBoardResDto> list;
    private int totalElements;
    private int totalPages;
    private int size;
}
