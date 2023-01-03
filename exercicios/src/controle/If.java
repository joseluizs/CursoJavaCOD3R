package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media =sc.nextDouble();
		
		if (media >= 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabéns");
		}
		if (media < 7.0 && media >= 4.5) {
			System.out.println("Recuperação!");
		}
		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado!");
		}
		sc.close();

	}

}
