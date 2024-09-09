package com.example.ex04.test;

import com.example.ex04.obj.AA;
import com.example.ex04.obj.BB;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final AA aa;
    private final BB bb;


    //JVM 직접 관리를 하고
    //AA aa = new AA();
    @GetMapping("aa")
    public String aa(){
        aa.doA();
        return "GMaa";
    }

    @PostMapping("bb")
    public String bb(){
        bb.doB();
        return "bbbbbbbb";
    }
}
