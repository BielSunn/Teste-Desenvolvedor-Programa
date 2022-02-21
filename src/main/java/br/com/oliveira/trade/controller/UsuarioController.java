package br.com.oliveira.trade.controller;

import java.sql.SQLException;

import br.com.oliveira.trade.dao.UsuarioDao;
import br.com.oliveira.trade.model.Usuario;

/**
 * Classe utilizada para servir como interm�dio entre a interface gr�fica e o
 * banco de dados
 * 
 * @author Gabriel Sun
 *
 */

public class UsuarioController {

	/**
	 * M�todo para cadastrar usu�rio no sistema, servindo de interm�dio entre a
	 * interface gr�fica e banco de dados
	 * 
	 * @param usuario -> atributos utilizados para o cadastro do usu�rio
	 * @throws SQLException -> caso ocorra algum erro SQL
	 */

	public void cadastrar(Usuario usuario) throws SQLException {

		UsuarioDao usuarioDao = new UsuarioDao();

		usuarioDao.cadastrar(usuario);

	}

	/**
	 * M�todo verifica��o de login do usu�rio , servindo de interm�dio entre a
	 * interface gr�fica e banco de dados
	 * 
	 * @param usuario -> email e senha informado na tela de login
	 * @return -> retorna se o usu�rio existe no sistema
	 * @throws SQLException -> caso ocorra algum erro SQL
	 */

	public boolean verificarLogin(Usuario usuario) throws SQLException {

		UsuarioDao usuarioDao = new UsuarioDao();

		boolean checkLogin = usuarioDao.verificarLogin(usuario);

		return checkLogin;

	}

}
