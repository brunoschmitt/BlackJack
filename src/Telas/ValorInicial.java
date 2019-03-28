package Telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Players.Player;

public class ValorInicial extends JFrame{

	
	Player player = new Player();
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValorInicial frame = new ValorInicial();
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
	public ValorInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 204, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSelecioneONumero = new JLabel("Fichas Iniciais\r\n");
		lblSelecioneONumero.setBounds(10, 22, 155, 14);
		contentPane.add(lblSelecioneONumero);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 47, 155, 20);
		comboBox.addItem(100);
		comboBox.addItem(200);
		comboBox.addItem(300);
		comboBox.addItem(400);
		comboBox.addItem(500);
		contentPane.add(comboBox);

		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    player.getPlayer().setSaldo((int) comboBox.getSelectedItem());
				//contentPane.setVisible(false);
				dispose();
				Aposta aposta = new Aposta();
				aposta.setVisible(true);
				
				

			}
		});
		btnContinuar.setBounds(10, 77, 89, 23);
		contentPane.add(btnContinuar);
	}
}
