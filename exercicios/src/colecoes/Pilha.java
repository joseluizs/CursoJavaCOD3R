package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> pilhaLivros = new ArrayDeque<>();

		pilhaLivros.add("O Pequeno Príncipe");
		pilhaLivros.push("Don Quixote");
		pilhaLivros.push("O Hobbit");

		System.out.println(pilhaLivros.peek());
		System.out.println(pilhaLivros.element());

		for (String livros : pilhaLivros) {
			System.out.println(livros);
		}
		
		System.out.println(pilhaLivros.pop()); // lança uma exceção
		System.out.println(pilhaLivros.poll());
		System.out.println(pilhaLivros.poll());
		System.out.println(pilhaLivros.poll());
		System.out.println(pilhaLivros.poll());
		// fila.size();
		// fila.clear();
		// fila.isEmpty()
		// fila.contains()
		
		
		
	}

}
