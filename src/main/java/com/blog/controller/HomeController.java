package com.blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Welcome to Blog System");
    }
    
    @GetMapping("/error")
    public ResponseEntity<String> handleError() {
        return ResponseEntity.badRequest().body("发生错误，请检查请求路径或参数");
    }
} 