package br.com.biblioteca.livros.adapter.http.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivrosDto {
    private Integer id;
    private String nome;
    private String descricao;
    private Integer valor;
}
