package lambdas;

public class Sistema1 {

	public static void main(String[] args) {
		Calculo c = new Somar();
		System.out.println(c.executar(2, 3));
		
		c = new Multiplicar();
		System.out.println(c.executar(2, 3));// polimorfismo

	}
}
