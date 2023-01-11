package oo.encapsulamento.casaA;

public class Paulo {

	void testeAcessos() {
		Ana esposa = new Ana();
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		//System.out.println(esposa.segredo);//private
		System.out.println(esposa.facoDentroDeCasa);//default
		System.out.println(esposa.formaDeFalar);//protected
		System.out.println(esposa.todosSabem); //public 
	}
}
