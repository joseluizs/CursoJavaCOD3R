package classe;

public class Produto {
	
	String nome;
	Double preco;
	static Double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	Double precoComDesconto() {
		return preco * (1 - desconto);
	}
	Double precoComDesconto(Double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}

}
