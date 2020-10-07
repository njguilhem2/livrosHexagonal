package br.com.biblioteca.livros.core.port;

import br.com.biblioteca.livros.adapter.datastore.entity.LivrosEntity;
import br.com.biblioteca.livros.core.model.Livros;

import java.util.List;

public interface LivrosRepositoryPort {
    LivrosEntity salvarLivros(Livros livros);
    List<LivrosEntity> listarTodosLivros();
    void deletarLivros(Integer id);
}
