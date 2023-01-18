package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Luiz", 7.1);
		Aluno a2= new Aluno("Lulu", 6.1);
		Aluno a3 = new Aluno("Esther", 8.1);
		Aluno a4 = new Aluno("Cris", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> melhorNota = (n1, n2) ->{
			if (n1.nota > n2.nota) return 1;
			if (n1.nota < n2.nota) return -1;
			return 0;
		};
		
		Comparator<Aluno> piorNota = (n1, n2) ->{
			if (n1.nota > n2.nota) return -1;
			if (n1.nota < n2.nota) return 1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		System.out.println(alunos.stream().max(piorNota).get());

	}

}
