package exerciciosPropostos;

import java.util.Scanner;

public class Ex03 {

	/*
	 * 3. Criar um programa que receba duas notas parciais, calcular a média final.
	 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se
	 * a nota for menor que 7.0 e maior do que 4.0 imprime no console
	 * "Recuperação", caso contrário imprime no console "Reprovado".
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		int n1 = sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		int n2 = sc.nextInt();
		double media = (n1 + n2) /2;
		
		if (media >= 7) {
			System.out.println("Aprovado!");
		} 
		else if (media > 4 && media < 7) {
			System.out.println("Recuperação!");
		}
		else {
			System.out.println("Reprovado!");
		}
		sc.close();

	}

}
