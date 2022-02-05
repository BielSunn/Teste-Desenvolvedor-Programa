package br.com.oliveira.trade.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {

	
	public static void main(String[] args) {
		try {
			ConnectionFactory.getConnection();
			JOptionPane.showMessageDialog(null, "Conectado");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro");
			e.printStackTrace();
		}
	}
	
	/**
	 * M�todo utilizado para conectar-se com banco de dados
	 * @return conex�o com banco de dados
	 * @throws SQLException - caso ocorra algum erro na conex�o
	 */
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String usuario = "postgres";
		String senha = "123";
		
		Connection conn = DriverManager.getConnection(url, usuario, senha);
		
		return conn;
	}
	
	

}
