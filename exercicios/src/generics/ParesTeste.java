package generics;

public class ParesTeste {

	public static void main(String[] args) {

		Pares<Integer, String> resultadoConcurso =  new Pares<>();
		resultadoConcurso.adicionar(1, "Luiz");
		resultadoConcurso.adicionar(2, "Cris");
		resultadoConcurso.adicionar(3, "Hadassa");
		resultadoConcurso.adicionar(4, "Esther");
		resultadoConcurso.adicionar(2, "Cristiane");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));
	}

}
