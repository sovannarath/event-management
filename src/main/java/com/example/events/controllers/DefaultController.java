package com.example.events.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello. Everyone!";
    }
}
