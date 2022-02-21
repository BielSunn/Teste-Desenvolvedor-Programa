package br.com.oliveira.trade.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import br.com.oliveira.trade.controller.UsuarioController;
import br.com.oliveira.trade.model.Usuario;

/**
 * Classe correspondente a Tela de Cadastro do Sistema
 * 
 * @author Gabriel Sun
 *
 */

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel painelCadastro;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField campoSenha;
	private JTextField txtLogradouro;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private ButtonGroup tipoSexo = new ButtonGroup();
	private JTextField txtTelefone;

	public TelaCadastro() {
		setTitle("Oliveira Trade");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 671);
		painelCadastro = new JPanel();
		painelCadastro.setBorder(null);
		setContentPane(painelCadastro);
		painelCadastro.setLayout(null);

		// Define as máscaras
		MaskFormatter mascaraCep = null;
		MaskFormatter mascaraCpf = null;
		MaskFormatter mascaraData = null;

		try {
			mascaraCep = new MaskFormatter("#####-###");
			mascaraCpf = new MaskFormatter("###.###.###-##");
			mascaraData = new MaskFormatter("##/##/####");
			mascaraCep.setPlaceholderCharacter('_');
			mascaraCpf.setPlaceholderCharacter('_');
			mascaraData.setPlaceholderCharacter('_');
		} catch (ParseException excp) {
			System.err.println("Erro na formatação: " + excp.getMessage());
		}

		painelDadosLogin();

		// painel dados pessoais
		JPanel painelDadosPessoais = painelDadosPessoal();

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 79, 90, 20);
		painelDadosPessoais.add(lblCpf);

		final JFormattedTextField campoCpf = new JFormattedTextField(mascaraCpf);
		campoCpf.setBounds(10, 110, 180, 26);
		painelDadosPessoais.add(campoCpf);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(295, 24, 169, 23);
		painelDadosPessoais.add(lblDataDeNascimento);

		final JFormattedTextField formattedTxtDataNascimento = new JFormattedTextField(mascaraData);
		formattedTxtDataNascimento.setBounds(295, 58, 180, 26);
		painelDadosPessoais.add(formattedTxtDataNascimento);

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(295, 162, 90, 20);
		painelDadosPessoais.add(lblEstado);

		final JComboBox comboBoxEstados = new JComboBox();
		comboBoxEstados.setModel(new DefaultComboBoxModel(new String[] { "Selecione", "Acre", "Alagoas", "Amapá",
				"Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso",
				"Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí",
				"Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina",
				"São Paulo", "Sergipe", "Tocantins" }));
		comboBoxEstados.setBounds(295, 193, 169, 25);
		painelDadosPessoais.add(comboBoxEstados);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(10, 283, 90, 20);
		painelDadosPessoais.add(lblCep);

		final JFormattedTextField campoCepFormatado = new JFormattedTextField(mascaraCep);
		campoCepFormatado.setBounds(10, 314, 180, 26);
		painelDadosPessoais.add(campoCepFormatado);

		final JButton btnCadastro = new JButton("Cadastrar");

		btnCadastro.addActionListener(new ActionListener() {

			/**
			 * Botão "Cadastrar" : realiza o cadastro do usuário no sistema, caso todos os
			 * campos estejam preenchidos
			 */
			public void actionPerformed(ActionEvent e) {

				if (txtNome.getText().equals("") 
						|| formattedTxtDataNascimento.getText().equals("")
						|| campoCpf.getText().equals("") 
						|| tipoSexo.getSelection() == null
						|| txtTelefone.getText().equals("") 
						|| txtEmail.getText().equals("")
						|| new String(campoSenha.getPassword()).equals("") 
						|| comboBoxEstados.getSelectedItem() == null
						|| txtCidade.getText().equals("") 
						|| txtBairro.getText().equals("")
						|| campoCepFormatado.getText().equals("") 
						|| txtLogradouro.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos ", "Erro ao cadastrar",
							JOptionPane.ERROR_MESSAGE);
				} else {

					String dataNascimento = formattedTxtDataNascimento.getText();
					DateTimeFormatter dataFormada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate dataFormatada = LocalDate.parse(dataNascimento, dataFormada);

					Usuario usuario = new Usuario(
							txtNome.getText(), 
							dataFormatada, 
							campoCpf.getText(),
							tipoSexo.getSelection().getActionCommand(),
							txtEmail.getText(),
							new String(campoSenha.getPassword()),
							Integer.parseInt(txtTelefone.getText()),
							String.valueOf(comboBoxEstados.getSelectedItem()),
							txtCidade.getText(),
							txtBairro.getText(),
							campoCepFormatado.getText(),
							txtLogradouro.getText()
							);

					UsuarioController usuarioController = new UsuarioController();
					System.out.println("user antes cadastro: " + usuario.toString());

					try {
						usuarioController.cadastrar(usuario);
						System.out.println("user apos cadastro: " + usuario.toString());

						JOptionPane.showMessageDialog(null,
								"Usuário " + txtNome.getText() + " foi cadastrado com sucesso");
						new TelaLogin();
						dispose();

					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null, "Erro SQL: " + e1.getMessage(), "Erro ao cadastrar",
								JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					} catch (NumberFormatException erroNumber) {
						JOptionPane.showMessageDialog(null,
								"Digite somente números no telefone " + erroNumber.getMessage(), "Erro ao cadastrar",
								JOptionPane.ERROR_MESSAGE);
						erroNumber.printStackTrace();
					} catch (DateTimeParseException erroData) {
						JOptionPane.showMessageDialog(null, "Digite uma data válida: " + erroData.getMessage(),
								"Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});
		btnCadastro.setBounds(413, 388, 122, 34);
		painelDadosPessoais.add(btnCadastro);

		setVisible(true);

	}

	private void painelDadosLogin() {
		JPanel painelDadosLogin = new JPanel();
		painelDadosLogin.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Dados de Login", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelDadosLogin.setBounds(0, 0, 610, 144);
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
	}

	private JPanel painelDadosPessoal() {

		JPanel painelDadosPessoais = new JPanel();
		painelDadosPessoais.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Dados Pessoais", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelDadosPessoais.setBounds(0, 156, 610, 476);
		painelCadastro.add(painelDadosPessoais);
		painelDadosPessoais.setLayout(null);

		JLabel lblLogradouro = new JLabel("Logradouro");
		lblLogradouro.setBounds(295, 297, 90, 20);
		painelDadosPessoais.add(lblLogradouro);

		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(295, 328, 240, 26);
		painelDadosPessoais.add(txtLogradouro);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 215, 90, 20);
		painelDadosPessoais.add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(10, 246, 180, 26);
		painelDadosPessoais.add(txtCidade);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 90, 20);
		painelDadosPessoais.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(10, 42, 180, 26);
		painelDadosPessoais.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(295, 229, 90, 20);
		painelDadosPessoais.add(lblBairro);

		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(295, 260, 200, 26);
		painelDadosPessoais.add(txtBairro);

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(295, 95, 90, 20);
		painelDadosPessoais.add(lblSexo);

		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setActionCommand("Masculino");
		rdbtnMasculino.setBounds(295, 122, 109, 23);
		painelDadosPessoais.add(rdbtnMasculino);

		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setActionCommand("Feminino");
		rdbtnFeminino.setBounds(426, 122, 109, 23);
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
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaLogin();
				dispose();
			
			}
		});
		btnVoltar.setBounds(34, 388, 122, 34);
		painelDadosPessoais.add(btnVoltar);

		return painelDadosPessoais;
	}
}
