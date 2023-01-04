package com.example.elasticsearch1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("log")
public class MainController {

    @PostMapping("")
    public ResponseEntity<?> request(){
        return ResponseEntity.ok("Hello this is log");
    }
}
