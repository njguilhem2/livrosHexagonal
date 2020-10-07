package br.com.biblioteca.livros.core.converter;

import br.com.biblioteca.livros.adapter.http.dto.LivrosDto;
import br.com.biblioteca.livros.core.model.Livros;

public class DtoToModel {
    public static Livros dtoToModel(LivrosDto livrosDto){
        return Livros.builder().nome(livrosDto.getNome())
                .id(livrosDto.getId())
                .descricao(livrosDto.getDescricao())
                .valor(livrosDto.getValor())
                .build();
    }
}
