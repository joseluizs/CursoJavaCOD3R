package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		DAO<Aluno> dao = new DAO<>();
		
		Aluno aluno =  new Aluno(123L, "Luiz");
		AlunoBolsista alunoBolsista = new AlunoBolsista(345L, "Luizinho", 1000);
		
		dao.incluirAtomico(aluno);
		dao.incluirAtomico(alunoBolsista);
		dao.fechar();

	}

}
