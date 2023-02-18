package br.com.luiz.exerciciosspringboot.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.luiz.exerciciosspringboot.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
