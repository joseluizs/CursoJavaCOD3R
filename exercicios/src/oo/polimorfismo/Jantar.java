package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa p = new Pessoa(99.65);
		
		Arroz ingrediente = new Arroz(0.2);
		Feijao ingrediente1 = new Feijao(0.1);
		Sorverte sobremesa = new Sorverte(0.05);
		
		System.out.println(p.getPeso());
		
		p.comer(ingrediente);
		p.comer(ingrediente1);
		System.out.println(p.getPeso());
		
		p.comer(sobremesa);
		System.out.println(p.getPeso());
	}
}
