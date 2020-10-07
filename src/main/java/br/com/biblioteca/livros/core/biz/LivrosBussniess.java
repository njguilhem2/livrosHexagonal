package br.com.biblioteca.livros.core.biz;

import br.com.biblioteca.livros.adapter.http.dto.LivrosDto;
import br.com.biblioteca.livros.core.converter.DtoToModel;
import br.com.biblioteca.livros.core.converter.EntityToModel;
import br.com.biblioteca.livros.core.model.Livros;
import br.com.biblioteca.livros.core.port.LivrosBussniessPort;
import br.com.biblioteca.livros.core.port.LivrosRepositoryPort;

import java.util.List;

public class LivrosBussniess implements LivrosBussniessPort {

    public LivrosBussniess(LivrosRepositoryPort livrosRepositoryPort){
        this.livrosRepositoryPort = livrosRepositoryPort;
    }
    private final LivrosRepositoryPort livrosRepositoryPort;

    @Override
    public Livros salvarLivros(LivrosDto livrosDto) {
        var livros = DtoToModel.dtoToModel(livrosDto);
        return EntityToModel.entityToModel(livrosRepositoryPort.salvarLivros(livros));
    }

    @Override
    public List<Livros> listarTodosLivros() {
        return null;
    }

    @Override
    public void deletarLivros(Integer id) {

    }
}
