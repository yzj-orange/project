package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
    @RequestMapping("/get")
    public void getString(){
        System.out.println(111);
//        return "11";
    }

}
