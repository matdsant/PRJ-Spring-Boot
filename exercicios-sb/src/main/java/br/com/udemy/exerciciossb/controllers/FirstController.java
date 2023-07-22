package br.com.udemy.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola() {
        return "Olá Spring Boot!";
    }
}