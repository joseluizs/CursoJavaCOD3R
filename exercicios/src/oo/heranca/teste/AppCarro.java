package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class AppCarro {

	public static void main(String[] args) {
		System.out.println("Civic");
		Carro c = new Civic();
		c.acelerar();
		System.out.println(c);
		c.acelerar();
		System.out.println(c);
		c.acelerar();
		System.out.println(c);
		
		System.out.println("Ferrari ");
		Ferrari f = new Ferrari(400);
		f.ligarTurbo();
		f.acelerar();
		System.out.println(f);
		f.acelerar();
		System.out.println(f);
		f.acelerar();
		System.out.println(f);

	}

}
