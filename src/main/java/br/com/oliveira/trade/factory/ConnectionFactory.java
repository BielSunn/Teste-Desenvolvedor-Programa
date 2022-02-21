package br.com.oliveira.trade.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe que irá realizar uma fábrica de conexões com banco de dados
 * 
 * @author Gabriel Sun
 *
 */

public class ConnectionFactory {

	private static Connection conn;

	/**
	 * Método utilizado para criar uma conexão. A conexão será feita caso não tenha
	 * nenhuma feita.
	 * 
	 * @return -> conexão com banco de dados
	 * @throws SQLException - caso ocorra algum erro na conexão
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
