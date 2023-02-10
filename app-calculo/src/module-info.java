module app.calculo {
	requires transitive app.logging;
	exports br.com.luiz.app.calculo;
	
	/*
	 * exports br.com.luiz.app.calculo.interno to app.financeiro;
	 */	
	opens br.com.luiz.app.calculo to app.financeiro;
	
	requires app.api;
	provides br.com.luiz.app.Calculadora
	with br.com.luiz.app.calculo.CalculadoraImpl;
}