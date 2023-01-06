package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data dt = new Data();
		
		var dt1 = new Data(30, 10, 2012);
		
		
		System.out.println(dt.obterDataFormatada());
		System.out.println(dt1.obterDataFormatada());
		
	}

}
