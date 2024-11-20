package com.green.secondservice;


import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("second-service")
public class SecondController {

    private final Environment environment;

    @GetMapping("test")
    public String test(){
        System.out.println("여기 서버가 동작함" + environment.getProperty("local.sever.port"));
        return "SecondService";
    }
}
