package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class AppCarro {

	public static void main(String[] args) {
		Carro c = new Civic();
		
		c.acelerar();
		System.out.println(c);
		c.acelerar();
		System.out.println(c);
		c.acelerar();
		System.out.println(c);
		
		Carro f = new Ferrari(300);
		f.acelerar();
		System.out.println(f);
		f.acelerar();
		System.out.println(f);
		f.acelerar();
		System.out.println(f);
	}

}
