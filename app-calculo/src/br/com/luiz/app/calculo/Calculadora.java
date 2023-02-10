package br.com.luiz.app.calculo;

import br.com.luiz.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return opAritmeticas.soma(nums);
	}
	
}
