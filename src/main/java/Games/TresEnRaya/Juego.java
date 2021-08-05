package Games.TresEnRaya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import java.awt.Font;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {
		
		// Creamos el diseño de la ventana añadiendo todas las componentes
		
		setTitle("Tres en Raya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 496);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(2, 2, 400, 455);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("O");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("X");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("O");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("O");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("X");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("O");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("X");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnNewButton_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(410, 2, 400, 455);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("Nueva Partida");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_9.setBounds(122, 10, 157, 27);
		btnNewButton_9.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_9.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(btnNewButton_9);
		
		JLabel lblNewLabel_6 = new JLabel("Turno del Jugador 1... ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 41, 380, 33);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 74, 400, 166);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Jugador 1 (X)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 10, 96, 32);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 37, 63, 29);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Humano");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(62, 120, 75, 21);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CPU");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(139, 121, 50, 21);
		panel_2.setLayout(null);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		
		panel_2.add(lblNewLabel);
		panel_2.add(lblNewLabel_1);
		panel_2.add(rdbtnNewRadioButton);
		panel_2.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(20, 114, 50, 32);
		panel_2.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 43, 96, 19);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 250, 400, 205);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Jugador 2 (O)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 10, 96, 32);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(20, 37, 63, 29);
		panel_3.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 43, 96, 19);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(20, 114, 50, 32);
		panel_3.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Humano");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(62, 120, 75, 21);
		panel_3.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("CPU");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_3.setBounds(139, 121, 50, 21);
		panel_3.add(rdbtnNewRadioButton_3);
		
		ButtonGroup bgroup_1 = new ButtonGroup();
		bgroup_1.add(rdbtnNewRadioButton_2);
		bgroup_1.add(rdbtnNewRadioButton_3);
		
	}
}
