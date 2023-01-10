package oo.composicao.desafio;

public class Item {
	
	final Integer qtd;
	final Produto produto;
	
	Item(Produto produto, Integer qtd){
		this.produto = produto;
		this.qtd = qtd;
	}
}
