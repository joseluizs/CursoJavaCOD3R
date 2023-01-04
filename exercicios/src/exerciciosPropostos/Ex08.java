package exerciciosPropostos;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {

	/*
	 * 8. Criar um programa que receba uma palavra e imprime no console letra por
	 * letra.
	 */
	public static void main(String[] args) {

		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Digite uma palavra: "); 
		  String palavra = sc.nextLine();
		
		  String[] ab = palavra.split("(?!^)");
		  System.out.println(Arrays.toString(ab));

		  sc.close();

	}

}
