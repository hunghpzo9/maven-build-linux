package com.example.elasticsearch1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("log")
public class MainController {

    @GetMapping("")
    public void request(){
        log.info("123123");
    }
}
