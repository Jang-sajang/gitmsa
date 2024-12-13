package com.mini.project.mypage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Repository repository;

    @GetMapping("users/selectall")
    public String selectall(){
        return "selectall";
    }
}
