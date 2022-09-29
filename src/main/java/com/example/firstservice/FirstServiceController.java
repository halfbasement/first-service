package com.example.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://local
@RestController
@RequestMapping("/first-service/")
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome(){
        return "퍼스트 서비스 입니다.";
    }
}
