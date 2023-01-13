package lambdas;

import java.util.function.Predicate;

public class PredicadoPredicate {
	
	public static void main(String[] args) {
		Predicate<Produto> isCaro = p -> (p.preco * (1 - p.desconto)) >= 750;
		
		Produto p = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(p));
	}

}
