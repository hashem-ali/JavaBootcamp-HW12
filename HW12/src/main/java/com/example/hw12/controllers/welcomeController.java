package com.example.hw12.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping("/name")
    public String getNamex(){
        return "My name is Hashem";
    }
    @GetMapping("/age")
    public String getAge(){
        return "My age is 25";
    }
    @GetMapping("/check/status")
    public String getStatus(){
        return "Everything OK";
    }
    @GetMapping("/health")
    public String getHealth(){
        return "Server health is up and running";
    }
}
