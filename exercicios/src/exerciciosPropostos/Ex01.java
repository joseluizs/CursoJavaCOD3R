package exerciciosPropostos;

import java.util.Scanner;

public class Ex01 {

	//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um número: ");
		int num = sc.nextInt();
		
		if (num >=0 && num <=10) {
			System.out.println("Número esta entre 0 e 10: ");
		}
		else
			System.out.println("Não esta entre 0 e 10");
		if (num % 2 == 0) {
			System.out.println("par: " + num);
		}
		else 
			System.out.println("Não é par");
		sc.close();

	}

}
