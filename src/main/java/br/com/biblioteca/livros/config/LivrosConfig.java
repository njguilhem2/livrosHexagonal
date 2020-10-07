package br.com.biblioteca.livros.config;

import br.com.biblioteca.livros.adapter.datastore.repository.LivrosRepository;
import br.com.biblioteca.livros.core.biz.LivrosBussniess;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class LivrosConfig {

    @Bean
    public LivrosBussniess livrosBussniess(LivrosRepository livrosRepository){
        return new LivrosBussniess(livrosRepository);
    }
}
