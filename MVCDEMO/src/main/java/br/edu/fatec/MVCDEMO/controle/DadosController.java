package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Biblioteca;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/livros")
public class DadosController {
    private static final List<Biblioteca>
            livros = new ArrayList<Biblioteca>();

    public DadosController() {
        livros.add(new Biblioteca("1984","Livre",100,"Abril"));
        livros.add(new Biblioteca("Diario de um banana","Livre",43,"Abril"));
        livros.add(new Biblioteca("Revolução dos bichos","Livre",91,"Abril"));
    }

    @GetMapping
    public List<Biblioteca> getLivros()
    {
        return livros;
    }
}