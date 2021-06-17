package com.example.runwithhtml2.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication
@Controller
public class gettingController {

    @GetMapping("/getting")
    public  String getting(Model model) {
        String hello = "Hello";
        model.addAttribute("hello", hello);
        return "getting";
    }
}
