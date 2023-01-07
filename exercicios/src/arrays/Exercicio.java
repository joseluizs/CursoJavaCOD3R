package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[2] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println("Media com for normal: " + totalAlunoA / notasAlunoA.length);
		
		for (double notasA : notasAlunoA) {
			System.out.println(notasA);
		}
		System.out.println("Media com foreach: " + totalAlunoA / notasAlunoA.length);
		
		
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println("Media: " + totalAlunoB / notasAlunoB.length);
		
		for (double notasB : notasAlunoB) {
			System.out.println(notasB);
		}
		System.out.println("Media com foreach: " + totalAlunoB / notasAlunoB.length);
		
	}

}
