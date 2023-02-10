module app.calculo {
	requires app.logging;
	exports br.com.luiz.app.calculo;
	
	exports br.com.luiz.app.calculo.interno
	to app.financeiro;
	
}