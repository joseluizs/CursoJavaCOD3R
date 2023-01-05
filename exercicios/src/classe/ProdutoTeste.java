package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();//var uma inferência de Produdo
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		Double precoFinal1 = p1.precoComDesconto(0.1);
		Double precoFinal2 = p2.precoComDesconto();
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		System.out.printf("Total: R$%.2f", precoFinal1 + precoFinal2);
	}

}
