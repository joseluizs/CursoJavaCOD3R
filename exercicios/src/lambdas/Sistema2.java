package lambdas;

public class Sistema2 {

	public static void main(String[] args) {
		Calculo c = (x, y) -> {return x + y; };
		System.out.println("Somar c/ corpo da função:" + c.executar(2, 3));
		c = (x, y) -> {return x * y; };
		System.out.println("Multiplicar c/ corpo da função: " + c.executar(2, 3));
		c = (x, y) -> {return x - y; };
		System.out.println("Diminuir c/ corpo da função: " + c.executar(2, 3));
		c = (x, y) -> {return x / y; };
		System.out.println("Dividir c/ corpo da função: " + c.executar(2, 3));
		
		c = (x, y) -> x + y;
		System.out.println("Somar s/ corpo da função:" + c.executar(2, 3));
		c = (x, y) -> x * y;
		System.out.println("Multiplicar s/ corpo da função: " + c.executar(2, 3));
		c = (x, y) -> x - y;
		System.out.println("Diminuir s/ corpo da função: " + c.executar(2, 3));
		c = (x, y) -> x / y;
		System.out.println("Dividir s/ corpo da função: " + c.executar(2, 3));

	}

}
