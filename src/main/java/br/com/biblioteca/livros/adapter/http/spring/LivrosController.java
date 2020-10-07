package br.com.biblioteca.livros.adapter.http.spring;

import br.com.biblioteca.livros.adapter.http.converter.ModelToDto;
import br.com.biblioteca.livros.adapter.http.dto.LivrosDto;
import br.com.biblioteca.livros.core.port.LivrosBussniessPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivrosController {
    private final LivrosBussniessPort livrosBussniessPort;
    @Autowired
    public LivrosController(LivrosBussniessPort livrosBussniessPort){
        this.livrosBussniessPort = livrosBussniessPort;
    }
    @PostMapping
    public ResponseEntity<LivrosDto> salvarLivros(@RequestBody LivrosDto livrosDto){
        return new ResponseEntity<>(ModelToDto.modelToDto(
                this.livrosBussniessPort.salvarLivros(livrosDto)), HttpStatus.CREATED);
    }
}
