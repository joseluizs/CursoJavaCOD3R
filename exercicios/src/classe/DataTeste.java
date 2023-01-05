package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data dt = new Data();
		dt.dia = 10;
		dt.mes = 10;
		dt.ano = 2020;
		
		var dt1 = new Data();
		dt1.dia = 11;
		dt1.mes = 11;
		dt1.ano = 2021;
		
		System.out.printf("%d/%d/%d", dt.dia, dt.mes, dt.ano);
		System.out.println();
		System.out.printf("%d/%d/%d", dt1.dia, dt1.mes, dt1.ano);
	}

}
