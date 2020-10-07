package br.com.biblioteca.livros.core.converter;

import br.com.biblioteca.livros.adapter.datastore.entity.LivrosEntity;
import br.com.biblioteca.livros.core.model.Livros;

public class EntityToModel {
    public static Livros entityToModel(LivrosEntity entity){
        return Livros.builder()
                .descricao(entity.getDescricao())
                .id(entity.getId())
                .nome(entity.getNome())
                .valor(entity.getValor())
                .build();
    }
}
