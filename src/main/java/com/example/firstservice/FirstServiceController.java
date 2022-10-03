package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://local
@RestController
@RequestMapping("/first-service/")
@Slf4j
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome(){
        return "퍼스트 서비스 입니다.";
    }


    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header){

        log.info(header);

        return "헬로월드 첫번째 서비스";
    }


}
