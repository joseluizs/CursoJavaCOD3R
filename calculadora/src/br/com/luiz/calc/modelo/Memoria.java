package br.com.luiz.calc.modelo;

public class Memoria {
	
	private static final Memoria instancia = new Memoria();
	
	private String textoAtual = "";

	private Memoria() {
		
	}
	
	public static Memoria getInstancia() {
		return instancia;
	}
	
	public String getTextoAtula() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
}
