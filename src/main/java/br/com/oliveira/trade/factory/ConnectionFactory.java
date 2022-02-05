package br.com.oliveira.trade.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
	/**
	 * Método utilizado para conectar-se com banco de dados
	 * @return conexão com banco de dados
	 * @throws SQLException - caso ocorra algum erro na conexão
	 */
	
	public static Connection getConnection() throws SQLException {
		String url = "";
		String usuario = "";
		String senha = "";
		
		Connection conn = DriverManager.getConnection(url, usuario, senha);
		
		return conn;
	}
	
	

}
