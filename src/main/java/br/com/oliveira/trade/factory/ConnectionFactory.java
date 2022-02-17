package br.com.oliveira.trade.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection conn;

	/**
	 * M�todo utilizado para criar uma conex�o. A conex�o ser� feita caso n�o tenha
	 * nenhuma feita.
	 * 
	 * @return -> conex�o com banco de dados
	 * @throws SQLException - caso ocorra algum erro na conex�o
	 */

	public static Connection getConnection() throws SQLException {

		if (conn == null) {

			String url = "jdbc:postgresql://localhost:5432/teste";
			String usuario = "postgres";
			String senha = "123";
			conn = DriverManager.getConnection(url, usuario, senha);

		}

		return conn;
	}

}
