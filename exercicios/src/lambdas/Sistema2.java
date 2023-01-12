package lambdas;

public class Sistema2 {

	public static void main(String[] args) {
		Calculo c = (x, y) -> {return x + y; };
		System.out.println(c.executar(2, 3));
		c = (x, y) -> {return x * y; };
		System.out.println(c.executar(2, 3));
		
		c = (x, y) -> x + y;
		System.out.println(c.executar(2, 3));
		c = (x, y) -> x * y;
		System.out.println(c.executar(2, 3));

	}

}
