package generics;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo!");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Integer> caixaB = new Caixa<>();
		caixaB.guardar(200);
		
		Integer coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
		Caixa<Double> caixaC = new Caixa<>();
		caixaC.guardar(200.00);
		
		Double coisaC = caixaC.abrir();
		System.out.println(coisaC);

	}

}
