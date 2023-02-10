package br.com.luiz.app.calculo;

import br.com.luiz.app.Calculadora;
import br.com.luiz.app.calculo.interno.OperacoesAritmeticas;
import br.com.luiz.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
}
