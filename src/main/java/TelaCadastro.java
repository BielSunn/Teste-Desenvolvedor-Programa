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

public class TelaCadastro extends JFrame {

	private JPanel painelCadastro;
	private JTextField textFieldNome;
	private JTextField textFieldEmail;
	private JPasswordField campoSenha;

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
		panel.setBorder(new TitledBorder(null, "Dados", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 588, 298);
		painelCadastro.add(panel);
		panel.setLayout(null);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(10, 52, 180, 26);
		textFieldNome.setColumns(10);
		panel.add(textFieldNome);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 21, 90, 20);
		panel.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(306, 21, 90, 20);
		panel.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(307, 55, 180, 26);
		panel.add(textFieldEmail);
		
		JLabel lblSenha_1 = new JLabel("Senha");
		lblSenha_1.setBounds(306, 124, 90, 20);
		panel.add(lblSenha_1);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(306, 155, 180, 26);
		panel.add(campoSenha);
		
		JLabel lblCpf_1 = new JLabel("CPF");
		lblCpf_1.setBounds(10, 117, 90, 20);
		panel.add(lblCpf_1);
		
		JFormattedTextField formattedTextFieldCpf_1 = new JFormattedTextField();
		formattedTextFieldCpf_1.setBounds(10, 153, 180, 26);
		panel.add(formattedTextFieldCpf_1);
		
		JLabel lblTelefone_1 = new JLabel("Telefone");
		lblTelefone_1.setBounds(10, 206, 90, 20);
		panel.add(lblTelefone_1);
		
		JFormattedTextField campoTelefone = new JFormattedTextField();
		campoTelefone.setBounds(10, 239, 180, 26);
		panel.add(campoTelefone);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 309, 588, 278);
		painelCadastro.add(panel_1);
		panel_1.setLayout(null);
	}
}
