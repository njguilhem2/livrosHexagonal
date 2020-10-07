package br.com.biblioteca.livros.adapter.http.converter;

import br.com.biblioteca.livros.adapter.http.dto.LivrosDto;
import br.com.biblioteca.livros.core.model.Livros;

public class ModelToDto {
    public static LivrosDto modelToDto(Livros livros){
        return LivrosDto.builder()
                .id(livros.getId())
                .descricao(livros.getDescricao())
                .nome(livros.getNome())
                .valor(livros.getValor())
                .build();
    }
}
