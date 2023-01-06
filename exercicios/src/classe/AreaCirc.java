package classe;

public class AreaCirc {

	Double raio;
	static final Double PI = 3.1415;
	
	AreaCirc(Double raioInicial) {
		this.raio = raioInicial;
	}
	
	Double area() {
		return PI * Math.pow(raio, 2);
	}
}
