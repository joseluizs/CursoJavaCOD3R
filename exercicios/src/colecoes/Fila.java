package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		//offer e add -> adicionam elementos na fila
		//diferença é o comportamento quando a fila esta cheia
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Esther");
		
		//peek e element -> obtem o proximo elemento da fila (Sem remover)
		//diferença é o comportamento quando a fila esta vazia
		System.out.println(fila.peek()); // retorna null fila vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção fila vazia
		System.out.println(fila.element());
		
		//pool e remove -> obtem o proximo elemento da fila e remove
		//diferença é o comportamento quando a fila esta vazia
		System.out.println(fila.poll()); // fila vazia retorna null
		System.out.println(fila.remove()); // lança uma exceção fila vazia
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty()
		//fila.contains()
		
	}

}
