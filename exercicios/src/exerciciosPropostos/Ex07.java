package exerciciosPropostos;

import java.util.Scanner;

public class Ex07 {

	/*
	 * 7. Criar um programa que enquanto estiver recebendo números positivos,
	 * imprime no console a soma dos números inseridos, caso receba um número
	 * negativo, encerre o programa. Tente utilizar a estrutura do while.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int num = 0;

		while (num >= -1){
			System.out.print("Digite um número positivo ");
			num = sc.nextInt();
			if (num >= 0) {
				soma = num + soma;
			}
		}
		System.out.println(soma);
		sc.close();
	}
}
