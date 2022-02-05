package br.com.oliveira.trade.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class TelaCadastro extends JFrame {

	private JPanel painelCadastro;
	private JTextField txtNome;
	private JTextField textFieldEmail;
	private JPasswordField campoSenha;
	private JTextField txtEndereco;
	private JTextField txtCidade;
	private JTextField txtNumero;
	private JTextField txtBairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 626);
		painelCadastro = new JPanel();
		painelCadastro.setBorder(null);
		setContentPane(painelCadastro);
		painelCadastro.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Dados de Login", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 0, 588, 142);
		painelCadastro.add(panel);
		panel.setLayout(null);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 25, 90, 20);
		panel.add(lblEmail);

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(10, 56, 240, 26);
		panel.add(textFieldEmail);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(324, 25, 90, 20);
		panel.add(lblSenha);

		campoSenha = new JPasswordField();
		campoSenha.setBounds(324, 56, 180, 26);
		panel.add(campoSenha);

		JPanel painelDadosPessoais = new JPanel();
		painelDadosPessoais.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Dados Pessoais", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelDadosPessoais.setBounds(0, 153, 588, 434);
		painelCadastro.add(painelDadosPessoais);
		painelDadosPessoais.setLayout(null);

		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(10, 328, 240, 26);
		painelDadosPessoais.add(txtEndereco);

		JLabel lblEndereco = new JLabel("Endereco");
		lblEndereco.setBounds(10, 297, 90, 20);
		painelDadosPessoais.add(lblEndereco);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 215, 90, 20);
		painelDadosPessoais.add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(10, 246, 180, 26);
		painelDadosPessoais.add(txtCidade);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(345, 147, 90, 20);
		painelDadosPessoais.add(lblCep);

		JFormattedTextField campoCep = new JFormattedTextField();
		campoCep.setBounds(345, 178, 180, 26);
		painelDadosPessoais.add(campoCep);

		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(345, 300, 46, 14);
		painelDadosPessoais.add(lblNumero);

		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(345, 328, 46, 26);
		painelDadosPessoais.add(txtNumero);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 90, 20);
		painelDadosPessoais.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(10, 42, 180, 26);
		painelDadosPessoais.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 147, 90, 20);
		painelDadosPessoais.add(lblTelefone);

		JFormattedTextField campoTelefone = new JFormattedTextField();
		campoTelefone.setBounds(10, 178, 180, 26);
		painelDadosPessoais.add(campoTelefone);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 79, 90, 20);
		painelDadosPessoais.add(lblCpf);

		JFormattedTextField campoCpf = new JFormattedTextField();
		campoCpf.setBounds(10, 110, 180, 26);
		painelDadosPessoais.add(campoCpf);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(345, 10, 169, 23);
		painelDadosPessoais.add(lblDataDeNascimento);

		JFormattedTextField formattedTxtDataNascimento = new JFormattedTextField();
		formattedTxtDataNascimento.setBounds(345, 42, 180, 26);
		painelDadosPessoais.add(formattedTxtDataNascimento);

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(345, 79, 90, 20);
		painelDadosPessoais.add(lblSexo);

		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Feminino" }));
		comboBoxSexo.setBounds(345, 111, 102, 25);
		painelDadosPessoais.add(comboBoxSexo);

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(345, 218, 90, 20);
		painelDadosPessoais.add(lblBairro);

		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(345, 249, 200, 26);
		painelDadosPessoais.add(txtBairro);
		
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBounds(423, 370, 122, 34);
		painelDadosPessoais.add(btnCadastro);
	}
}
