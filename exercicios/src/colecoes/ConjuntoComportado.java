package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		
		SortedSet<String> listaAprovados = new TreeSet<>(); // ordenado
		listaAprovados.add("Luiz");
		listaAprovados.add("Cris");
		listaAprovados.add("Hadassa");
		listaAprovados.add("Esther");
		
		for (String cadidato : listaAprovados) {
			System.out.println(cadidato);
		}
		System.out.println();
		
		Set<String> listaAprovados1 = new HashSet<>(); // desordenado
		listaAprovados1.add("Luiz");
		listaAprovados1.add("Cris");
		listaAprovados1.add("Hadassa");
		listaAprovados1.add("Esther");
		
		for (String cadidato : listaAprovados1) {
			System.out.println(cadidato);
		}

	}

}
