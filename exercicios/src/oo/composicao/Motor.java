package oo.composicao;

public class Motor {
	
	Boolean ligado = false;
	Double fatorInjecao = 1.0;
	
	Integer giros() {
		if (!ligado) {
			return 0;
		}
		else {
			return (int) Math.round(fatorInjecao * 3000.0) ;
		}
	}
}
