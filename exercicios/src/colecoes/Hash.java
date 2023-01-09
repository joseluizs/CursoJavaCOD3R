package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Usuario> usu = new HashSet<>();
		
		usu.add(new Usuario("Luiz"));
		usu.add(new Usuario("Cris"));
		usu.add(new Usuario("Hadassa"));
		
		boolean res = usu.contains(new Usuario("Luiz"));
		System.out.println(res);

	}

}
