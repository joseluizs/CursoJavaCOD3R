package classe;

public class Produto {
	
	String nome;
	Double preco;
	Double desconto;
	
	public Produto() {
		
	}
	
	Double precoComDesconto() {
		return preco * (1 - desconto);
	}
	Double precoComDesconto(Double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}

}
