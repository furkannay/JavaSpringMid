package com.midt.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Cs204Midback {
    @Autowired
    private TeachersRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(Cs204Midback.class, args);
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("teachers",repo.findAll());
        return "index";
    }
    @GetMapping("/api")
    public String aboutapi(){
        return "api";
    }

}