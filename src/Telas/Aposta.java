package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;

import Players.Player;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Aposta extends JFrame {

	private JPanel contentPane;
	Player player = new Player();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aposta frame = new Aposta();
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
	public Aposta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 198, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	

		textField = new JTextField();
		textField.setBounds(10, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player.getPlayer().setAposta((int) Integer.parseInt(textField.getText()));
				dispose();
				Mesa mesa = new Mesa();
				mesa.setVisible(true);
				System.out.println(player.getPlayer().getSaldo());
			}
		});
		btnOk.setBounds(10, 79, 89, 23);
		contentPane.add(btnOk);

		JLabel lblValorDaAposta = new JLabel("Valor da Aposta");
		lblValorDaAposta.setBounds(10, 11, 121, 14);
		contentPane.add(lblValorDaAposta);
		
		
	}
}
