package br.com.luiz.app.calculo;

import br.com.luiz.app.calculo.interno.OperacoesAritmeticas;
import br.com.luiz.app.logging.Logger;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
}
