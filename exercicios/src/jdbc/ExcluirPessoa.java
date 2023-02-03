package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException{
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Digite o código para ser deletado! ");
		int codigo = sc.nextInt();
		
		Connection conn = FabricaConexao.getConexao();
		String delete = "delete from pessoas where codigo = ?";
		
		PreparedStatement stmt = conn.prepareStatement(delete);
		stmt.setInt(1, codigo);
		
		if (stmt.executeUpdate() > 0) {
			System.out.println("Pessoa Excluida!");
		}else {
			System.out.println("Pessoa Não Excluida!");
		}
		
		stmt.close();
		conn.close();
		sc.close();

	}

}
