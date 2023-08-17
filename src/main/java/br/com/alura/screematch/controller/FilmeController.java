package br.com.alura.screematch.controller;

import br.com.alura.screematch.domain.filme.DadosCadastroFilme;
import br.com.alura.screematch.domain.filme.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
    private List<Filme> filmes = new ArrayList<Filme>();

    @GetMapping
    public String carregaPaginaFormulario() {
       return  "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilmes(DadosCadastroFilme dados) {
        var filme = new Filme(dados);
        filmes.add(filme);

        System.out.println(filmes);

        return "filmes/formulario";
    }
}
