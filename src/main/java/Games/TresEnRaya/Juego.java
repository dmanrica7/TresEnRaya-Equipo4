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
import java.awt.event.*;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JTextField textField_jug2;
	private JTextField textField_jug1;
	private int[][] tablero;
	private int turno;

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
		
		// Inicializamos las varibles
		this.turno = 1;
		this.tablero = new int[3][3];
		
		// Creamos el diseño de la ventana añadiendo todas las componentes
		
		setTitle("Tres en Raya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 496);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_tablero = new JPanel();
		panel_tablero.setBounds(2, 2, 400, 455);
		contentPane.add(panel_tablero);
		panel_tablero.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton casilla_00 = new JButton("");
		casilla_00.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_00);
		
		JButton casilla_01 = new JButton("");
		casilla_01.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_01);
		
		JButton casilla_02 = new JButton("");
		casilla_02.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_02);
		
		JButton casilla_10 = new JButton("");
		casilla_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_10);
		
		JButton casilla_11 = new JButton("");
		casilla_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_11);
		
		JButton casilla_12 = new JButton("");
		casilla_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_12);
		
		JButton casilla_20 = new JButton("");
		casilla_20.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_20);
		
		JButton casilla_21 = new JButton("");
		casilla_21.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_21);
		
		JButton casilla_22 = new JButton("");
		casilla_22.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_22);
		
		JPanel panel_datos = new JPanel();
		panel_datos.setBounds(410, 2, 400, 455);
		contentPane.add(panel_datos);
		panel_datos.setLayout(null);
		
		JButton nueva_partida = new JButton("Nueva Partida");
		nueva_partida.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nueva_partida.setBounds(122, 10, 157, 27);
		nueva_partida.setAlignmentY(Component.TOP_ALIGNMENT);
		nueva_partida.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_datos.add(nueva_partida);
		
		JLabel et_jugando = new JLabel("Turno del Jugador 1... ");
		et_jugando.setFont(new Font("Tahoma", Font.PLAIN, 13));
		et_jugando.setBounds(10, 41, 380, 33);
		panel_datos.add(et_jugando);
		
		JPanel panel_jug1 = new JPanel();
		panel_jug1.setBounds(0, 74, 400, 166);
		panel_datos.add(panel_jug1);
		
		JLabel lblNewLabel = new JLabel("Jugador 1 (X)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 10, 96, 32);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 37, 63, 29);
		
		JRadioButton hum_1 = new JRadioButton("Humano");
		hum_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		hum_1.setBounds(62, 120, 75, 21);
		
		JRadioButton cpu_1 = new JRadioButton("CPU");
		cpu_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cpu_1.setBounds(139, 121, 50, 21);
		panel_jug1.setLayout(null);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(hum_1);
		bgroup.add(cpu_1);
		
		panel_jug1.add(lblNewLabel);
		panel_jug1.add(lblNewLabel_1);
		panel_jug1.add(hum_1);
		panel_jug1.add(cpu_1);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(20, 114, 50, 32);
		panel_jug1.add(lblNewLabel_5);
		
		textField_jug1 = new JTextField();
		textField_jug1.setBounds(81, 43, 96, 19);
		panel_jug1.add(textField_jug1);
		textField_jug1.setColumns(10);
		
		JPanel panel_jug2 = new JPanel();
		panel_jug2.setBounds(0, 250, 400, 205);
		panel_datos.add(panel_jug2);
		panel_jug2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Jugador 2 (O)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 10, 96, 32);
		panel_jug2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(20, 37, 63, 29);
		panel_jug2.add(lblNewLabel_3);
		
		textField_jug2 = new JTextField();
		textField_jug2.setBounds(81, 43, 96, 19);
		panel_jug2.add(textField_jug2);
		textField_jug2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(20, 114, 50, 32);
		panel_jug2.add(lblNewLabel_4);
		
		JRadioButton humano_2 = new JRadioButton("Humano");
		humano_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		humano_2.setBounds(62, 120, 75, 21);
		panel_jug2.add(humano_2);
		
		JRadioButton cpu_2 = new JRadioButton("CPU");
		cpu_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cpu_2.setBounds(139, 121, 50, 21);
		panel_jug2.add(cpu_2);
		
		ButtonGroup bgroup_1 = new ButtonGroup();
		bgroup_1.add(cpu_2);
		bgroup_1.add(humano_2);
	}
	
	private boolean esGanador() {
		for(int i=0;i<3;i++) {
			if(tablero[i][0]==tablero[i][1] && tablero[i][0]==tablero[i][2] && tablero[i][0]!=0) {
				return true;
			}else if(tablero[0][i]==tablero[1][i] && tablero[0][i]==tablero[2][i] && tablero[i][0]!=0) {
				return true;
			}
		}
		if((tablero[0][0]==tablero[1][1] && tablero[0][0]==tablero[2][2] && tablero[0][0]!=0) || (tablero[0][2]==tablero[1][1] && tablero[0][2]==tablero[2][0] && tablero[0][2]!=0)){
			return true;
		}
		return false;
	}
	
}
