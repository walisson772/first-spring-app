package com.walisson.first_spring_app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("opa")
public class HolloWordController {

    @GetMapping
    public String helloWord(){
        return "Olá mundo";
    }
}
