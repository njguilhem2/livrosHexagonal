package br.com.biblioteca.livros.core.port;

import br.com.biblioteca.livros.adapter.http.dto.LivrosDto;
import br.com.biblioteca.livros.core.model.Livros;
import java.util.*;

public interface LivrosBussniessPort {

    Livros salvarLivros(LivrosDto livros);
    List<Livros> listarTodosLivros();
    void deletarLivros(Integer id);
}
