package Telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Players.Bot;
import Players.Deck;
import Players.Player;

public class Mesa extends JFrame {

	private JPanel contentPane;
	private int cont = 2;
	Player player = new Player();
	Deck deck = new Deck();
	Bot bot = new Bot();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mesa frame = new Mesa();
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
	public Mesa() {
		deck.getDeck().shuffle();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCarta_1 = new JLabel(player.getPlayer().getHand().getFirstCard());
		lblCarta_1.setBounds(109, 156, 98, 14);
		contentPane.add(lblCarta_1);

		JLabel lblCarta_2 = new JLabel(player.getPlayer().getHand().getFirstCard());
		lblCarta_2.setBounds(217, 156, 98, 14);
		contentPane.add(lblCarta_2);

		JLabel lblSaldo = new JLabel("Saldo:\r\n");
		lblSaldo.setBounds(10, 296, 46, 14);
		contentPane.add(lblSaldo);

		JLabel label = new JLabel("***");
		label.setBounds(10, 327, 46, 14);
		contentPane.add(label);

		JLabel lblAposta = new JLabel("Aposta");
		lblAposta.setBounds(10, 11, 46, 14);
		contentPane.add(lblAposta);

		JLabel lblApostando = new JLabel(Integer.toString(player.getPlayer().getAposta()));
		lblApostando.setBounds(10, 36, 71, 14);
		contentPane.add(lblApostando);

		JLabel botCarta10 = new JLabel("botCarta10\r\n");
		botCarta10.setBounds(172, 111, 75, 14);
		contentPane.add(botCarta10);

		JLabel botCarta11 = new JLabel("botCarta11\r\n");
		botCarta11.setBounds(257, 111, 97, 14);
		contentPane.add(botCarta11);

		JLabel lblCarta_3 = new JLabel("Carta3");
		lblCarta_3.setBounds(49, 181, 89, 14);

		JLabel lblCarta_4 = new JLabel("Carta4");
		lblCarta_4.setBounds(161, 181, 98, 14);

		JLabel lblCarta_5 = new JLabel("Carta5");
		lblCarta_5.setBounds(269, 181, 98, 14);

		JLabel lblCarta_6 = new JLabel("Carta6");
		lblCarta_6.setBounds(49, 199, 89, 14);

		JLabel lblCarta_7 = new JLabel("Carta7");
		lblCarta_7.setBounds(161, 199, 98, 14);

		JLabel lblCarta_8 = new JLabel("Carta8");
		lblCarta_8.setBounds(269, 199, 46, 14);

		JLabel lblCarta_9 = new JLabel("Carta9\r\n");
		lblCarta_9.setBounds(49, 216, 46, 14);

		JLabel lblCarta_10 = new JLabel("Carta10\r\n");
		lblCarta_10.setBounds(161, 216, 46, 14);

		JLabel lblCarta_11 = new JLabel("Carta11\r\n");
		lblCarta_11.setBounds(269, 216, 46, 14);

		JButton btnHit = new JButton("Hit");
		btnHit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cont++;
				int valorBot;
				int valorPlayer;
				
				valorPlayer =+ deck.getDeck().valor();
				if (cont == 3) {
					deck.getDeck().giveCards();
					contentPane.add(lblCarta_3);
					contentPane.repaint();

				} else if (cont == 4) {
					contentPane.add(lblCarta_4);
					contentPane.repaint();
				} else if (cont == 5) {
					contentPane.add(lblCarta_5);
					contentPane.repaint();
				} else if (cont == 6) {
					contentPane.add(lblCarta_6);
					contentPane.repaint();
				} else if (cont == 7) {
					contentPane.add(lblCarta_7);
					contentPane.repaint();
				} else if (cont == 8) {
					contentPane.add(lblCarta_8);
					contentPane.repaint();
				} else if (cont == 9) {
					contentPane.add(lblCarta_9);
					contentPane.repaint();
				} else if (cont == 10) {
					contentPane.add(lblCarta_10);
					contentPane.repaint();
				} else if (cont == 11) {
					contentPane.add(lblCarta_11);
					contentPane.repaint();
				}

			}
		});
		btnHit.setBounds(335, 292, 89, 23);
		contentPane.add(btnHit);

		JButton btnStand = new JButton("Stand");
		btnStand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.repaint();
			}
		});
		btnStand.setBounds(335, 323, 89, 23);
		contentPane.add(btnStand);

		JLabel botCarta3 = new JLabel("botCarta3");
		botCarta3.setBounds(76, 61, 86, 14);
		contentPane.add(botCarta3);

		JLabel botCarta4 = new JLabel("botCarta4");
		botCarta4.setBounds(172, 61, 71, 14);
		contentPane.add(botCarta4);

		JLabel botCarta5 = new JLabel("botCarta5\r\n");
		botCarta5.setBounds(257, 61, 71, 14);
		contentPane.add(botCarta5);

		JLabel botCarta6 = new JLabel("botCarta6\r\n\r\n");
		botCarta6.setBounds(76, 86, 71, 14);
		contentPane.add(botCarta6);

		JLabel botCarta7 = new JLabel("botCarta7\r\n\r\n");
		botCarta7.setBounds(172, 86, 71, 14);
		contentPane.add(botCarta7);

		JLabel botCarta8 = new JLabel("botCarta8");
		botCarta8.setBounds(257, 86, 71, 14);
		contentPane.add(botCarta8);

		JLabel botCarta9 = new JLabel("botCarta9\r\n");
		botCarta9.setBounds(76, 111, 71, 14);
		contentPane.add(botCarta9);

		JLabel botCarta2 = new JLabel(bot.getBot().getHand().getFirstCard());
		botCarta2.setBounds(199, 36, 71, 14);
		contentPane.add(botCarta2);

		JLabel botCarta1 = new JLabel(bot.getBot().getHand().getSecondCard());
		botCarta1.setBounds(109, 36, 71, 14);
		contentPane.add(botCarta1);
		
		if ()
		
		
		
		
		
		
		
		
		
	}
}
