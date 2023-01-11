package oo.heranca.desafio;

public class Ferrari extends Carro {

	Ferrari() {
		this(315);
	}

	Ferrari(int velcidadeMaxima) {
		super(velcidadeMaxima);
		delta = 15;
	}

	/*
	 * @Override void acelerar() { super.acelerar(); }
	 */

}
