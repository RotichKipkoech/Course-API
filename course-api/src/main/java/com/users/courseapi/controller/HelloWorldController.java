package com.users.courseapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String showHelloWorldString(){
        return "Hello Spring Boot!";
    }
}
