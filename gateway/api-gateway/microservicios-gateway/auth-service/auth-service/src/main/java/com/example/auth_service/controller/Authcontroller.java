package com.example.auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class Authcontroller {

    @GetMapping("/test")
    public String test() {
        return "AUTH SERVICE OK";
    }
}