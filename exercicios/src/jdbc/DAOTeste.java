package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String insert = "insert into pessoas (nome) values(?)";
		System.out.println(dao.incluir(insert, "Aia"));
		System.out.println(dao.incluir(insert, "Bia"));
		System.out.println(dao.incluir(insert, "Cia"));
		System.out.println(dao.incluir(insert, "Dia"));

		dao.close();
	}

}
