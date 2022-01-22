package com.indialone.javatpointdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo {

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }
    
}
