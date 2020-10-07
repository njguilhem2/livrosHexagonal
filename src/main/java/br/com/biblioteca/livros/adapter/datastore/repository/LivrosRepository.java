package br.com.biblioteca.livros.adapter.datastore.repository;

import br.com.biblioteca.livros.adapter.datastore.converter.ModelToEntity;
import br.com.biblioteca.livros.adapter.datastore.entity.LivrosEntity;
import br.com.biblioteca.livros.core.model.Livros;
import br.com.biblioteca.livros.core.port.LivrosRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class LivrosRepository implements LivrosRepositoryPort {
    @Autowired
    private SQLRepository sqlRepository;

    @Override
    public LivrosEntity salvarLivros(Livros livros) {

        return sqlRepository.save(ModelToEntity.modelParaEntity(livros));
    }

    @Override
    public List<LivrosEntity> listarTodosLivros() {
        return null;
    }

    @Override
    public void deletarLivros(Integer id) {

    }
}
