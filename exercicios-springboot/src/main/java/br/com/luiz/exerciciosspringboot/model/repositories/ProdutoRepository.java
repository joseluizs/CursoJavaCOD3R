package br.com.luiz.exerciciosspringboot.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.luiz.exerciciosspringboot.model.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	
	//findByNomeContaining
	//findByNomeNotContaining
	//findByNomeIsContaining
	//findByNomeContains
	//findByNomeStartWith
	//findByNomeEndsWith
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
	@Query("select p from Produto p where p.nome like %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
