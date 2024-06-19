package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {


    @GetMapping("/test1")
    @ResponseBody
    public String test1() {
        return "Get hello";
    }

    @PostMapping("/test2")
    @ResponseBody
    public String test2() {
        return "Post hello";
    }


}
