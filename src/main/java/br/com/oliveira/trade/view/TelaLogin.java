package br.com.oliveira.trade.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.oliveira.trade.controller.UsuarioController;
import br.com.oliveira.trade.model.Usuario;

/**
 * Classe correspondente a Tela de Login do Sistema
 * 
 * @author Gabriel Sun
 *
 */

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel painelLogin;
	private JTextField txtEmail;
	private JPasswordField campoSenha;

	public TelaLogin() {
		setTitle("Oliveira Trade");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 602);
		painelLogin = new JPanel();
		painelLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelLogin);
		painelLogin.setLayout(null);

		JLabel lblNomeEmpresa = new JLabel("Oliveira Trade");
		lblNomeEmpresa.setBackground(new Color(240, 240, 240));
		lblNomeEmpresa.setBounds(187, 50, 98, 49);
		painelLogin.add(lblNomeEmpresa);

		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setBounds(52, 146, 46, 14);
		painelLogin.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(52, 167, 374, 28);
		painelLogin.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(52, 238, 46, 14);
		painelLogin.add(lblSenha);

		campoSenha = new JPasswordField();
		campoSenha.setBounds(52, 263, 374, 28);
		painelLogin.add(campoSenha);

		JButton btnEntrar = new JButton("Entrar");

		/**
		 * Ao clicar no botao "Entrar", será verificado se existe o email e senha. Caso
		 * sim será redirecionado para a tela do sistema Caso não exista ou foi
		 * informado algum dado incorreto será mostrado uma mensagem de erro
		 */
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Usuario usuario = new Usuario(
						txtEmail.getText(), 
						new String(campoSenha.getPassword())
						);

				UsuarioController usuarioController = new UsuarioController();

				try {
					if (usuarioController.verificarLogin(usuario)) {
						JOptionPane.showMessageDialog(null, "Login realizado");
						new TelaSistema();
						dispose(); // fecha a tela de login

					} else
						JOptionPane.showMessageDialog(null, "Email e/ou Senha inválido(s)", "Erro de login",
								JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnEntrar.setBounds(322, 362, 104, 28);
		painelLogin.add(btnEntrar);

		JButton btnCadastrar = new JButton("Cadastrar");

		/**
		 * Ao clicar no Botão "Cadastrar" será redirecionado para a tela de Cadastro
		 */
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaCadastro();
				dispose(); // fecha a tela de login

			}
		});

		JLabel lblNewLabel = new JLabel("Cadastre-se aqui");
		lblNewLabel.setBounds(52, 323, 104, 28);
		painelLogin.add(lblNewLabel);

		btnCadastrar.setBounds(52, 362, 104, 28);
		painelLogin.add(btnCadastrar);

		setVisible(true);
	}
}
