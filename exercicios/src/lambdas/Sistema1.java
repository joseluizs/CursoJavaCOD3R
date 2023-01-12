package lambdas;

public class Sistema1 {

	public static void main(String[] args) {
		Calculo c = new Somar();
		System.out.println("Somar : " + c.executar(2, 3));// polimorfismo
		
		c = new Multiplicar();
		System.out.println("Multiplicar " + c.executar(2, 3));// polimorfismo
		
		c =  new Dividir();
		System.out.println("Dividir " + c.executar(2, 3));// polimorfismo
		
		c = new Diminuir();
		System.out.println("Diminuir " + c.executar(2, 3));// polimorfismo

	}
}
