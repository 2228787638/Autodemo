package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
