package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, Integer qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	void adicionarItem(String nome, Double preco, Integer qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	Double obterValorTotal() {
		double total = 0.0;
		
		for (Item item : itens) {
			total += item.qtd * item.produto.preco;
		}
		
		return total;
	}

}
