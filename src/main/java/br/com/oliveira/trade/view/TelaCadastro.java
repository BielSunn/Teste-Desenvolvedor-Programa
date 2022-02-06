package br.com.oliveira.trade.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import br.com.oliveira.trade.controller.UsuarioController;
import br.com.oliveira.trade.model.Usuario;
import javax.swing.JRadioButton;

public class TelaCadastro extends JFrame {

	private JPanel painelCadastro;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField campoSenha;
	private JTextField txtEndereco;
	private JTextField txtCidade;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private ButtonGroup tipoSexo = new ButtonGroup();
	private JTextField txtTelefone;

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

		// Define as máscaras
		MaskFormatter mascaraCep = null;
		MaskFormatter mascaraTelefone = null;
		MaskFormatter mascaraCpf = null;
		MaskFormatter mascaraData = null;

		try {
			mascaraCep = new MaskFormatter("#####-###");
			mascaraTelefone = new MaskFormatter("(##)####-####");
			mascaraCpf = new MaskFormatter("#########-##");
			mascaraData = new MaskFormatter("##/##/####");
			mascaraCep.setPlaceholderCharacter('_');
			mascaraTelefone.setPlaceholderCharacter('_');
			mascaraCpf.setPlaceholderCharacter('_');
			mascaraData.setPlaceholderCharacter('_');
		} catch (ParseException excp) {
			System.err.println("Erro na formatação: " + excp.getMessage());
			// System.exit(-1);
		}

		JPanel painelDadosLogin = new JPanel();
		painelDadosLogin.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Dados de Login", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelDadosLogin.setBounds(0, 0, 588, 142);
		painelCadastro.add(painelDadosLogin);
		painelDadosLogin.setLayout(null);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 25, 90, 20);
		painelDadosLogin.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(10, 56, 240, 26);
		painelDadosLogin.add(txtEmail);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(324, 25, 90, 20);
		painelDadosLogin.add(lblSenha);

		campoSenha = new JPasswordField();
		campoSenha.setBounds(324, 56, 180, 26);
		painelDadosLogin.add(campoSenha);

		// painel dados pessoais
		JPanel painelDadosPessoais = painelDadosPessoal();

//		final JFormattedTextField campoTelefone = new JFormattedTextField();
//		campoTelefone.setBounds(10, 397, 180, 26);
//		painelDadosPessoais.add(campoTelefone);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 79, 90, 20);
		painelDadosPessoais.add(lblCpf);

		final JFormattedTextField campoCpf = new JFormattedTextField(mascaraCpf);
		campoCpf.setBounds(10, 110, 180, 26);
		painelDadosPessoais.add(campoCpf);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(345, 10, 169, 23);
		painelDadosPessoais.add(lblDataDeNascimento);

		final JFormattedTextField formattedTxtDataNascimento = new JFormattedTextField(mascaraData);
		formattedTxtDataNascimento.setBounds(345, 42, 180, 26);
		painelDadosPessoais.add(formattedTxtDataNascimento);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(345, 147, 90, 20);
		painelDadosPessoais.add(lblCep);

		JFormattedTextField campoCep = new JFormattedTextField(mascaraCep);
		campoCep.setBounds(345, 178, 180, 26);
		painelDadosPessoais.add(campoCep);

		JButton btnCadastro = new JButton("Cadastrar");
		
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Usuario usuario = new Usuario(
						txtNome.getText(), 
						formattedTxtDataNascimento.getText(),
						campoCpf.getText(), 
						txtEmail.getText(), 
						new String(campoSenha.getPassword()),
						txtTelefone.getText(), 
						tipoSexo.getSelection().getActionCommand()
						);
				System.out.println(usuario.toString());
				System.out.println(tipoSexo.getSelection().getActionCommand());
				
				UsuarioController usuarioController = new UsuarioController();
				try {
					usuarioController.cadastrar(usuario);
					JOptionPane.showMessageDialog(null, "Usuário " + txtNome.getText() + " foi cadastrado com sucesso");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Erro SQL: " + e1.getMessage(), "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				} catch (NumberFormatException erroNumber) {
					JOptionPane.showMessageDialog(null, "Erro String " + erroNumber.getMessage(), "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnCadastro.setBounds(423, 370, 122, 34);
		painelDadosPessoais.add(btnCadastro);
	}

	private JPanel painelDadosPessoal() {

		JPanel painelDadosPessoais = new JPanel();
		painelDadosPessoais.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Dados Pessoais", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelDadosPessoais.setBounds(0, 153, 588, 434);
		painelCadastro.add(painelDadosPessoais);
		painelDadosPessoais.setLayout(null);

		JLabel lblEndereco = new JLabel("Endereco");
		lblEndereco.setBounds(10, 297, 90, 20);
		painelDadosPessoais.add(lblEndereco);

		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(10, 328, 240, 26);
		painelDadosPessoais.add(txtEndereco);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 215, 90, 20);
		painelDadosPessoais.add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(10, 246, 180, 26);
		painelDadosPessoais.add(txtCidade);

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

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(345, 218, 90, 20);
		painelDadosPessoais.add(lblBairro);

		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(345, 249, 200, 26);
		painelDadosPessoais.add(txtBairro);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(345, 79, 90, 20);
		painelDadosPessoais.add(lblSexo);

		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setActionCommand("Masculino");
		rdbtnMasculino.setBounds(341, 112, 109, 23);
		painelDadosPessoais.add(rdbtnMasculino);

		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setActionCommand("Feminino");
		rdbtnFeminino.setBounds(452, 112, 109, 23);
		painelDadosPessoais.add(rdbtnFeminino);

		tipoSexo.add(rdbtnMasculino);
		tipoSexo.add(rdbtnFeminino);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 147, 90, 20);
		painelDadosPessoais.add(lblTelefone);

		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(10, 178, 180, 26);
		painelDadosPessoais.add(txtTelefone);

		return painelDadosPessoais;
	}
}
