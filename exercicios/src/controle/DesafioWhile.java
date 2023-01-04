package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.println("Informe a nota? ");
			nota = sc.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				total += nota;
				qtdNotas++;
			}
			else if (nota != -1){
				System.out.println("Nota invalida! ");
			}
			
		}

		double media = total/qtdNotas;
		System.out.println("MEdia = " + media);
		sc.close();
		
		int a = 3;
		int b = 3;
		
		if ( a==b) {
			System.out.println();
		}
	}

}
