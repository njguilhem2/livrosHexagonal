package br.com.biblioteca.livros.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Livros {
    private Integer id;
    private String nome;
    private String descricao;
    private Integer valor;
}
