package br.com.oliveira.trade.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class TelaLogin2 extends JFrame {

	private JPanel painelLogin;
	private JTextField txtEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin2 frame = new TelaLogin2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 506);
		painelLogin = new JPanel();
		painelLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelLogin);
		painelLogin.setLayout(null);

		JLabel lblNomeEmpresa = new JLabel("Oliveira Trade");
		lblNomeEmpresa.setBackground(new Color(240, 240, 240));
		lblNomeEmpresa.setBounds(167, 48, 98, 49);
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

		passwordField = new JPasswordField();
		passwordField.setBounds(52, 263, 374, 28);
		painelLogin.add(passwordField);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtEmail.getText().equals("teste@gmail") && passwordField.getText().equals("123@")) {
					JOptionPane.showMessageDialog(null, "Login realizado");
				}

				Usuario usuario = new Usuario();
				usuario.setEmail(txtEmail.getText());
				usuario.setSenha(new String (passwordField.getPassword()) );
				UsuarioController usuarioController = new UsuarioController();

			}
		});
		btnEntrar.setBounds(52, 341, 104, 28);
		painelLogin.add(btnEntrar);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaCadastro2();
				// dispose(); // fecha a tela de login
				setVisible(false);

			}
		});
		btnCadastrar.setBounds(322, 371, 104, 28);
		painelLogin.add(btnCadastrar);

		JLabel lblNewLabel = new JLabel("Cadastre-se aqui");
		lblNewLabel.setBounds(326, 325, 104, 28);
		painelLogin.add(lblNewLabel);
	}

}
