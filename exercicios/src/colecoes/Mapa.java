package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Luiz");
		usuarios.put(2, "CRIS");
		usuarios.put(3, "Esther");
		usuarios.put(4, "JL");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Luiz"));
		System.out.println(usuarios.get(4));
		
		for (Integer chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
			
		}

	}

}
