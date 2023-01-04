package exerciciosPropostos;

import java.util.Scanner;

public class Ex04 {

	/*
	 * 4. Criar um programa que receba um número e diga se ele é um número primo.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor pra saber é Primo:");
		int num =  sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Número Primo!" + num);
		}
		else
			System.out.println("Não é Primo!");

		sc.close();

	}

}
