package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
		String nome = sc.nextLine();
		
		Connection conn = FabricaConexao.getConexao();
		
		String sql = "insert into pessoas (nome) values(?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		stmt.close();
		
		System.out.println("Pessoa incluida com sucesso!");
		sc.close();

	}

}
