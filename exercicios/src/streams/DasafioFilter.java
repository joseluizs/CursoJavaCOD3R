package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DasafioFilter {

	public static void main(String[] args) {

		Escolar e = new Escolar("Luiz", "Paranoa", 200);
		Escolar e1 = new Escolar("Cris", "Paranoa", 200);
		Escolar e2 = new Escolar("Esther", "Paranoa", 200);
		Escolar e3 = new Escolar("Hadassa", "Itapua", 220);
		Escolar e4 = new Escolar("João", "Itapua", 220);
		Escolar e5 = new Escolar("Bia", "Itapua", 220);

		List<Escolar> escolar = Arrays.asList(e, e1, e2, e3, e4,e5);
		
		Function<String, String> rota1 = x -> x;
		Predicate<Escolar> valor = x -> x.mensalidade >= 200;
		
		
	}

}
