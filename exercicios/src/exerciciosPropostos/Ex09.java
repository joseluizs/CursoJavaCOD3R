package exerciciosPropostos;

import java.util.Scanner;

public class Ex09 {

	/*
	 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		Integer valor;
		int maior = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Informe o " + (i + 1) + "º valor: ");
			valor = sc.nextInt();
			if (valor >= maior) {
				maior = valor;
			}
		}
		System.out.println("Maior  é " + maior);
		sc.close();

	}

}
