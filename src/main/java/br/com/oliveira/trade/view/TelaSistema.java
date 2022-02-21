package br.com.oliveira.trade.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaSistema extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel painelPrincipal;

	public TelaSistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 484);
		painelPrincipal = new JPanel();
		painelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelPrincipal);
		painelPrincipal.setLayout(null);

		JLabel lblSistema = new JLabel("Sistema Oliveira Trade");
		lblSistema.setBounds(150, 81, 157, 98);
		painelPrincipal.add(lblSistema);

		setVisible(true);
	}
}
