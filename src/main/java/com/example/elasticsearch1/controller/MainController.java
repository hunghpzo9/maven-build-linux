package com.example.elasticsearch1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("test")
public class MainController {

    @PostMapping("getRequestIp")
    public ResponseEntity<?> request(){
        return ResponseEntity.ok("Chào bé iu cánh cụt của anh. Anh iu em nhiều lắm <3");
    }
}
