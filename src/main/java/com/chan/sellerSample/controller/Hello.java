package com.chan.sellerSample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String Hi(){
        return "hi";
    }

    @GetMapping("/hi")
    public String HELLO(){
        return "hello seller";
    }

    @GetMapping("/checkHealth")
    public String checkHealth(){
        return "check health";
    }
}

