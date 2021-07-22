package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ha {
    @RequestMapping("/get")
    public String get(){
        return "get";
    }
}
