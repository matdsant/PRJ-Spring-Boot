package br.com.udemy.exerciciossb.controllers;

import br.com.udemy.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente getCliente() {
        return new Cliente(28, "Pedro", "123.456.789-10");
    }
}
