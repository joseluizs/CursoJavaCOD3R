package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	//Ana mae = new Ana();
	void testeAcessos() {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		//System.out.println(genro.segredo); //private
		//System.out.println(genro.facoDentroDeCasa); //default
		System.out.println(formaDeFalar); //protected
		System.out.println(todosSabem); //public 
	}

}
