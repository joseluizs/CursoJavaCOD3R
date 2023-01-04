package exerciciosPropostos;

import java.util.Scanner;

public class Ex02 {

	//2. Criar um programa informa se o ano atual é um ano bissexto;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o ano: ");
		int ano = sc.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("Ano é bissexto: " + ano);
		}
		else
			System.out.println("Não é bissexto; ");

		sc.close();

	}

}
