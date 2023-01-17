package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Luiz", 7.1);
		Aluno a2= new Aluno("Lulu", 6.1);
		Aluno a3 = new Aluno("Esther", 8.1);
		Aluno a4 = new Aluno("Cris", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BiFunction<Media, Double, Media> calcMedia = (media , nota) -> media.adicionar(nota);
		BinaryOperator<Media> combMedia = (m1, m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream().filter(aprovado).map(apenasNota).reduce(new Media(), calcMedia, combMedia);
		System.out.println("A media dos aprovados é :" + media.getValor());
		
		
	}
}
