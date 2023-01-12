package lambdas;

import java.util.function.BinaryOperator;

public class Sistema3 {

	public static void main(String[] args) {
		BinaryOperator<Double> c = (x, y) -> {return x + y;};
		System.out.println("Somar c/ BinaryOperator:" + c.apply(2.0, 3.0));
		
		c = (x, y) -> {	return x * y;};
		System.out.println("Multiplicar c/ BinaryOperator: " + c.apply(2.0, 3.0));

		c = (x, y) -> {return x - y;};
		System.out.println("Diminuir c/ corpo da função: " + c.apply(2.0, 3.0));
		
		c = (x, y) -> {	return x / y;};
		System.out.println("Dividir c/ corpo da função:: " + c.apply(2.0, 3.0));

		c = (x, y) -> x + y;
		System.out.println("Somar s/ corpo da função:" + c.apply(2.0, 3.0));
		
		c = (x, y) -> x * y;
		System.out.println("Multiplicar s/ corpo da função: " + c.apply(2.0, 3.0));
		
		c = (x, y) -> x - y;
		System.out.println("Diminuir s/ corpo da função: " + c.apply(2.0, 3.0));
		
		c = (x, y) -> x / y;
		System.out.println("Dividir s/ corpo da função: " + c.apply(2.0, 3.0));

	}

}
