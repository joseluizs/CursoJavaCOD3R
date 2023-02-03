package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite código da pessoa: ");
		int codigo = sc.nextInt();
				
		String select = "select codigo, nome from pessoas where codigo = ?";
		String update = "update pessoas set nome = ? where codigo = ?";
		
		Connection conn = FabricaConexao.getConexao();
		PreparedStatement stmt = conn.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();
		
		if (r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O nome atual é: " + p.getNome());
			sc.nextLine();
			
			System.out.print("Indique o novo nome: ");
			String novoNome = sc.nextLine();
			
			stmt.close();
			stmt = conn.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
		} else {
			System.out.println("Pessoa não encontrada!");
		}
		
		stmt.close();
		conn.close();
		sc.close();

	}

}
