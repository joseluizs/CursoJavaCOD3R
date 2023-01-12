package lambdas;

public class Diminuir implements Calculo{

	@Override
	public double executar(double a, double b) {
		return a - b;
	}

}
