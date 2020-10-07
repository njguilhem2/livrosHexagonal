package br.com.biblioteca.livros.adapter.datastore.repository;

import br.com.biblioteca.livros.adapter.datastore.entity.LivrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public interface SQLRepository extends JpaRepository<LivrosEntity,Integer> {

}
