package br.com.oliveira.trade.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	/**
	 * Método utilizado para conectar-se com banco de dados
	 * 
	 * @return conexão com banco de dados
	 * @throws SQLException - caso ocorra algum erro na conexão
	 */

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/teste";
		String usuario = "postgres";
		String senha = "123";

		Connection conn = DriverManager.getConnection(url, usuario, senha);

		return conn;
	}

}
