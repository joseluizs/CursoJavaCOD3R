package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("JL");
		
		lista.add(u1);
		lista.add(new Usuario("Cris"));
		lista.add(new Usuario("Hadassa"));
		lista.add(new Usuario("Esther"));
		lista.add(new Usuario("Luiz"));
		System.out.println("Lista Original: ");
		
		for (Usuario u : lista) {
			System.out.println(u);	
		}
		
		System.out.println();
		System.out.println("Pelo indice " + lista.get(3)); // acessar pelo indice
		
		System.out.println();
		System.out.println("Removido JL >>>>>> " + lista.remove(new Usuario("JL")));
		
		System.out.println();
		System.out.println("Tem? " + lista.contains(new Usuario("Cris")));
		
		System.out.println("Nova lista");
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
		
	}

}
