package br.com.oliveira.trade.controller;

import java.sql.SQLException;

import br.com.oliveira.trade.dao.UsuarioDao;
import br.com.oliveira.trade.model.Usuario;

/**
 * Classe utilizada para servir como intermédio entre a interface gráfica e o
 * banco de dados
 * 
 * @author Gabriel Sun
 *
 */

public class UsuarioController {

	/**
	 * Método para cadastrar usuário no sistema, servindo de intermédio entre a
	 * interface gráfica e banco de dados
	 * 
	 * @param usuario -> atributos utilizados para o cadastro do usuário
	 * @throws SQLException -> caso ocorra algum erro SQL
	 */

	public void cadastrar(Usuario usuario) throws SQLException {

		UsuarioDao usuarioDao = new UsuarioDao();

		usuarioDao.cadastrar(usuario);

	}

	/**
	 * Método verificação de login do usuário , servindo de intermédio entre a
	 * interface gráfica e banco de dados
	 * 
	 * @param usuario -> email e senha informado na tela de login
	 * @return -> retorna se o usuário existe no sistema
	 * @throws SQLException -> caso ocorra algum erro SQL
	 */

	public boolean verificarLogin(Usuario usuario) throws SQLException {

		UsuarioDao usuarioDao = new UsuarioDao();

		boolean checkLogin = usuarioDao.verificarLogin(usuario);

		return checkLogin;

	}

}
