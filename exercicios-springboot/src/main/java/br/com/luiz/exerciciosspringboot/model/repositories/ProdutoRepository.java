package br.com.luiz.exerciciosspringboot.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luiz.exerciciosspringboot.model.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
