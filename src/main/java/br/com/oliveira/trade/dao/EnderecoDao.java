package br.com.oliveira.trade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.oliveira.trade.factory.ConnectionFactory;
import br.com.oliveira.trade.model.Endereco;

public class EnderecoDao {

	public int cadastrar(Endereco endereco) throws SQLException {

		Connection conn = ConnectionFactory.getConnection();

		String sql = "INSERT INTO T_OT_ENDERECO (nm_estado, nm_cidade, nm_bairro, nr_cep, ds_logradouro) VALUES"
				+ "(?, ?, ?, ?, ?)";

		PreparedStatement ps = conn.prepareStatement(sql);

//		ps.setLong(1, endereco.getIdUsuario().getIdUsuario());
		ps.setString(1, endereco.getEstado());
		ps.setString(2, endereco.getCidade());
		ps.setString(3, endereco.getBairro());
		ps.setInt(4, endereco.getCep());
		ps.setString(5, endereco.getLogradouro());
		
		return ps.executeUpdate();

	}

}
