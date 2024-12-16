package com.project.mypage.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("selectall")
    public String selectall(){
        return "selectall";
    }
}
