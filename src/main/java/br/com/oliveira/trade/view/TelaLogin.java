package br.com.oliveira.trade.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel painelLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
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
		
		textField = new JTextField();
		textField.setBounds(52, 167, 374, 28);
		painelLogin.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(52, 238, 46, 14);
		painelLogin.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(52, 263, 374, 28);
		painelLogin.add(passwordField);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(52, 341, 104, 28);
		painelLogin.add(btnEntrar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaCadastro();
				//dispose(); // fecha a tela de login
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
