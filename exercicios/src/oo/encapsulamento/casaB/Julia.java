package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		Ana nora = new Ana();
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		//System.out.println(esposa.segredo);//private
		//System.out.println(nora.facoDentroDeCasa);//default
		//System.out.println(nora.formaDeFalar);//protected
		System.out.println(nora.todosSabem); //public 
	}

}
