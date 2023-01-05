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
		
		System.out.println(dt.obterDataFormatada());
		System.out.println(dt1.obterDataFormatada());
		
	}

}
