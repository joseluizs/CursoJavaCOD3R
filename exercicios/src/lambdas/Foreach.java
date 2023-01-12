package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Luiz", "Cris", "Esther");
		
		System.out.println("Forma tradicional foreach");
		for (String nomes : aprovados) {
			System.out.println(nomes);
		}
		
		System.out.println("\nCom Lambda #01 ...");
		aprovados.forEach((nomes) -> {System.out.println(nomes + "!!! ");});
		System.out.println("\nCom Lambda #01 s/ () {}; ...");
		aprovados.forEach(nomes -> System.out.println(nomes + "!!! ")); // com um paramêtro não precisa () {}

		System.out.println("\nMethod Reference......");
		aprovados.forEach(System.out::println);
		
	}

}
