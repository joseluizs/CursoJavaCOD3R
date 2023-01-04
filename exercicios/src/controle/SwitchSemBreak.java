package controle;

import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a faixa do Karate");
		String faixa = sc.nextLine();
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai Dai...");
		case "marrom":
			System.out.println("Sei o Teki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
			break;
		default:
			System.out.println("Não sei nada");
		}
		System.out.println("Fim do Karate");
		
		int idade = 3;
		switch (idade) {
		case 3:
			System.out.println("Sabe argumentar:");
		case 2:
			System.out.println("Sabe falar:");
		case 1:
			System.out.println("Sabe andar:");
		case 0:
			System.out.println("Sabe respira:");
		}
		
		sc.close();

	}

}
