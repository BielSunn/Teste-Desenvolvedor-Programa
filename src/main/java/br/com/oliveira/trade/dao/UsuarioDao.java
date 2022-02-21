package br.com.oliveira.trade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.oliveira.trade.factory.ConnectionFactory;
import br.com.oliveira.trade.model.Usuario;

/**
 * Classe utilizada para interagir com banco de dados, realizando insert e
 * select no mesmo.
 * 
 * @author Gabriel Sun
 *
 */

public class UsuarioDao {

	private Connection conn = null;

	public UsuarioDao() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}

	/**
	 * Método que irá cadastrar o usuário no sistema
	 * 
	 * @param usuario -> objeto usuário que recebe os atributos para o cadastro
	 * @return -> quantidade de linhas alteradas no banco, sendo 1 caso o cadastro
	 *         for realizado com sucesso
	 * @throws SQLException -> caso ocorra algum erro SQL
	 */

	public int cadastrar(Usuario usuario) throws SQLException {

		String sql = "INSERT INTO T_OT_USUARIO (nm_usuario, dt_nascimento, nr_cpf, tp_sexo, ds_email, ds_senha, "
				+ "nr_telefone, nm_estado, nm_cidade, nm_bairro, nr_cep, ds_logradouro) VALUES"
				+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		ps.setString(1, usuario.getNome());
		ps.setObject(2, usuario.getDataDeNascimento());
		ps.setString(3, usuario.getCpf());
		ps.setString(4, usuario.getSexo());
		ps.setString(5, usuario.getEmail());
		ps.setString(6, usuario.getSenha());
		ps.setInt(7, usuario.getNumeroTelefone());
		ps.setString(8, usuario.getEstado());
		ps.setString(9, usuario.getCidade());
		ps.setString(10, usuario.getBairro());
		ps.setString(11, usuario.getCep());
		ps.setString(12, usuario.getLogradouro());

		return ps.executeUpdate();

	}

	/**
	 * Método que irá verificar se o usuário possui um login no sistema, através de
	 * um Select no banco de dados que verifica pelo email e senha informado na tela
	 * de login.
	 * 
	 * @param usuario -> objeto usuario que recebe o email e senha
	 * @return -> se existe o login informado no sistema
	 * @throws SQLException -> caso ocorra algum erro SQL
	 */

	public boolean verificarLogin(Usuario usuario) throws SQLException {

		String sql = "SELECT * FROM T_OT_USUARIO where ds_email = ? and ds_senha = ?";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, usuario.getEmail());
		ps.setString(2, usuario.getSenha());

		ResultSet rs = ps.executeQuery();

		boolean checkLogin = false;

		if (rs.next()) {
			checkLogin = true;
		}

//		System.out.println("login: " + checkLogin);
		return checkLogin;
	}

}
