package br.com.oliveira.trade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.oliveira.trade.factory.ConnectionFactory;
import br.com.oliveira.trade.model.Usuario;

public class UsuarioDao {

	public int cadastrar(Usuario usuario) throws SQLException {

		Connection conn = ConnectionFactory.getConnection();

		String sql = "INSERT INTO T_OT_USUARIO (nm_usuario, dt_nascimento, nr_cpf, tp_sexo, ds_email, ds_senha, nr_telefone) VALUES"
				+ "(?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, usuario.getNome());
		ps.setString(2, usuario.getDataDeNascimento());
		ps.setString(3, usuario.getCpf());
		ps.setString(4, usuario.getSexo());
		ps.setString(5, usuario.getEmail());
		ps.setString(6, usuario.getSenha());
		ps.setString(7, usuario.getNumeroTelefone());
		
		return ps.executeUpdate();

	}

}
