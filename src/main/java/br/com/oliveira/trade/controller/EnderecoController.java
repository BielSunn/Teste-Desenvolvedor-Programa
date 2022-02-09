package br.com.oliveira.trade.controller;

import java.sql.SQLException;

import br.com.oliveira.trade.dao.EnderecoDao;
import br.com.oliveira.trade.model.Endereco;

public class EnderecoController {

	public void cadastrar(Endereco endereco) throws SQLException {
		
		EnderecoDao enderecoDao = new EnderecoDao();
		
		enderecoDao.cadastrar(endereco);
		
	}
	
	
	
	
}
