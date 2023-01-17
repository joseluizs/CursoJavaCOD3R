package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		Produto p1 = new Produto("Lapis", 1.99, 0.12, 30.0);
		Produto p2 = new Produto("Notebook", 4899.89, 0.32, 0.0);
		Produto p3 = new Produto("Caderno", 30.0, 0.45, 0.0);
		Produto p4 = new Produto("Impressora", 1200.99, 0.40, 0.0);
		Produto p5 = new Produto("Ipad", 3100.0, 0.29, 0.0);
		Produto p6 = new Produto("Relogio", 1900.0, 0.12, 0.0);
		Produto p7 = new Produto("Lapis", 800.0, 0.31, 0.0);

		List<Produto> lp = Arrays.asList(p1, p2, p3, p4, p5 ,p6 , p7);
		
		//Filter, filter, map
		Predicate<Produto> megaProm = p -> p.desconto >= 0.30;
		Predicate<Produto> freteGra = p -> p.valorFrete >= 0;
		Predicate<Produto> prodRelevane = p -> p.preco >= 500;
		Function<Produto, String> chamadaPromo = p -> "Aproveite! " + p.nome + " por R$: "	+p.preco;
		lp.stream()
			.filter(megaProm)
			.filter(freteGra)
			.filter(prodRelevane)
			.map(chamadaPromo)
			.forEach(System.out::println);
		
	}

}
