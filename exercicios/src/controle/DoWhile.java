package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	String text = "";
	do {
		System.out.println("VC precisa falar as palavra mágicas ....");
		System.out.print("Quer sair?");
		text = sc.nextLine();
	} while (!text.equalsIgnoreCase("por favor"));

	System.out.println("Obrigado");
	sc.close();

	}

}
