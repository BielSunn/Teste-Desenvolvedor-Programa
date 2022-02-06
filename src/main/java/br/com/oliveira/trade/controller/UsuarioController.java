package br.com.oliveira.trade.controller;

import java.sql.SQLException;

import br.com.oliveira.trade.dao.UsuarioDao;
import br.com.oliveira.trade.model.Usuario;

public class UsuarioController {

	public void cadastrar(Usuario usuario) throws SQLException {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		usuarioDao.cadastrar(usuario);
		
	}

}
