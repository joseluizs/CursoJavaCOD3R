package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodosStream {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Luiz", 7.1);
		Aluno a2= new Aluno("Lulu", 6.1);
		Aluno a3 = new Aluno("Esther", 8.1);
		Aluno a4 = new Aluno("Cris", 10);
		Aluno a5 = new Aluno("João", 7.1);
		Aluno a6= new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Esther", 8.1);
		Aluno a8 = new Aluno("Sousa", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct....");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit....");
		alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);
		
		System.out.println("\ntakeWhile....");
		alunos.stream().distinct().skip(2).takeWhile(a -> a.nota >= 7).forEach(System.out::println);

	}

}
