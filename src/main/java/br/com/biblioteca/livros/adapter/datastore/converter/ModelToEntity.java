package br.com.biblioteca.livros.adapter.datastore.converter;

import br.com.biblioteca.livros.adapter.datastore.entity.LivrosEntity;
import br.com.biblioteca.livros.core.model.Livros;

public class ModelToEntity {
    public static LivrosEntity modelParaEntity(Livros livros){
      return new LivrosEntity().builder()
                .id(livros.getId())
                .descricao(livros.getDescricao())
                .nome(livros.getNome())
                .valor(livros.getValor())
                .build();
    }
}
