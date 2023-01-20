package com.js.lab9_testjwt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping({"/hello"})
    public String welcomePage(){
        return "Welcome";
    }
}
