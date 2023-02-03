package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		Connection conn = FabricaConexao.getConexao();
		String sql = "select * from pessoas where nome like ?";
		
		System.out.println("Digite parte do nome para consulta");
		String parteNome = sc.nextLine();
				
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, "%" + parteNome + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ===> " + p.getNome());
		}
		
		stmt.close();
		conn.close();
		sc.close();
	}
}
