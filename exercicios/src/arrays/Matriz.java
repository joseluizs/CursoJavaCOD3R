package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos?  ");
		int qtdAlunos = sc.nextInt();
		System.out.println("Quantas notas por aluno?  ");
		int qtdNotas = sc.nextInt();
		
		Double[][] notasDaTurma = new Double[qtdAlunos][qtdNotas];
		
		Double total = 0.0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
				notasDaTurma[i][j] = sc.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		System.out.println();
		Double media = total / (qtdAlunos *qtdNotas);
		System.out.println("Media da turma é: " + media);
		
		System.out.println();
		for (Double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		sc.close();

	}

}
