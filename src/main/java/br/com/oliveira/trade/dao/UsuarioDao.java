package br.com.oliveira.trade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.oliveira.trade.factory.ConnectionFactory;
import br.com.oliveira.trade.model.Usuario;

public class UsuarioDao {

	private Connection conn = null;

	public UsuarioDao() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}

	public int cadastrar(Usuario usuario) throws SQLException {

		String sql = "INSERT INTO T_OT_USUARIO (nm_usuario, dt_nascimento, nr_cpf, tp_sexo, ds_email, ds_senha, "
				+ "nr_telefone, nm_estado, nm_cidade, nm_bairro, nr_cep, ds_logradouro) VALUES"
				+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

//		ps.setString(1, usuario.getNome());
//		ps.setObject(2, usuario.getDataDeNascimento());
//		ps.setString(3, usuario.getCpf());
//		ps.setString(4, usuario.getSexo());
//		ps.setString(5, usuario.getEmail());
//		ps.setString(6, usuario.getSenha());
//		ps.setInt(7, usuario.getNumeroTelefone());

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

		int executeUpdate = ps.executeUpdate();

//		ResultSet rs = ps.getGeneratedKeys();
//		int id = 0;
//		if (rs.next()) {
//			id = rs.getInt("id_usuario");
//		}
//		usuario.setId(id);
//		System.out.println("ID: " + usuario.getId());
//
//		ps.setLong(id, usuario.getId());

		return executeUpdate;

	}

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

		System.out.println("login: " + checkLogin);
		return checkLogin;
	}

}
