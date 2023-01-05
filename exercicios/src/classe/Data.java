package classe;

public class Data {

	Integer dia;
	Integer mes;
	Integer ano;
	
	String obterDataFormatada() {		
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
