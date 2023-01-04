package exerciciosPropostos;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
	
	/*
	 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
	 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
	 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
	 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
	 * o número armazenado.
	 */

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		int rand = random.nextInt(10);
		int num = -0;
		int count = 0;
		while (num != rand) {
			System.out.println("Digite um numero de 0 10 ");
			num = sc.nextInt();
			if (num == rand) {
				System.out.println("Vc acertou! " + rand + " jogou ->" + count + " vezes");
				
			}
			count++;
		}
		sc.close();

	}

}
