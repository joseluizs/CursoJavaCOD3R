package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaNumero<Double> caixa1 = new CaixaNumero<>();
		caixa1.guardar(2.3);
		System.out.println(caixa1.abrir());
		
		CaixaNumero<Integer> caixa2 = new CaixaNumero<>();
		caixa2.guardar(123);
		System.out.println(caixa2.abrir());

	}

}
