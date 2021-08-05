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
import javax.swing.JOptionPane;
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
		casilla_00.setName("00");
		casilla_00.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_00);
		
		JButton casilla_01 = new JButton("");
		casilla_01.setName("01");
		casilla_01.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_01);
		
		JButton casilla_02 = new JButton("");
		casilla_02.setName("02");
		casilla_02.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_02);
		
		JButton casilla_10 = new JButton("");
		casilla_10.setName("10");
		casilla_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_10);
		
		JButton casilla_11 = new JButton("");
		casilla_11.setName("11");
		casilla_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_11);
		
		JButton casilla_12 = new JButton("");
		casilla_12.setName("12");
		casilla_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_12);
		
		JButton casilla_20 = new JButton("");
		casilla_20.setName("20");
		casilla_20.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_20);
		
		JButton casilla_21 = new JButton("");
		casilla_21.setName("21");
		casilla_21.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_21);
		
		JButton casilla_22 = new JButton("");
		casilla_22.setName("22");
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
		
		JLabel et_jug1 = new JLabel("Jugador 1 (X)");
		et_jug1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		et_jug1.setBounds(10, 10, 96, 32);
		
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
		
		panel_jug1.add(et_jug1);
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
		
		JLabel et_jug2 = new JLabel("Jugador 2 (O)");
		et_jug2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		et_jug2.setBounds(10, 10, 96, 32);
		panel_jug2.add(et_jug2);
		
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
		
		// Creamos la accion para cada boton
		ActionListener new_game = new ActionListener() {
			public void actionPerformed(ActionEvent new_game) {
				clearTablero();
				turno=1;
				Component[] componentes = panel_tablero.getComponents();
				for(int i=0;i<componentes.length;i++) {
					if(componentes[i] instanceof JButton) {
						JButton bot = (JButton)componentes[i];
						bot.setText("");
					}
				}
				if(textField_jug1.getText().equals("")) {
					et_jugando.setText("Turno del Jugador 1");
				}else {
					et_jugando.setText("Turno de "+textField_jug1.getText());
				}
			}
		};
		nueva_partida.addActionListener(new_game);
		
		ActionListener ganar = new ActionListener() {
			public void actionPerformed(ActionEvent ganar) {
				if(esGanador()) {
					if(turno==1) {
						// Si estamos en el turno 1 quiere decir que el jugador 2 es el que acaba de hacer su movimiento
						// Por lo tanto el ganandor es el jugador 2
						if(textField_jug2.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "¡Gana "+et_jug2.getText()+"!");						
						}else {
							JOptionPane.showMessageDialog(null, "¡Gana "+textField_jug2.getText()+"!");						
						}
					}else {
						// Si estamos en el turno 2 quiere decir que el jugador 1 es el que acaba de hacer su movimiento
						// Por lo tanto el ganandor es el jugador 1
						if(textField_jug1.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "¡Gana "+et_jug1.getText()+"!");						
						}else {
							JOptionPane.showMessageDialog(null, "¡Gana "+textField_jug1.getText()+"!");						
						}
					}
					et_jugando.setText("Juego Finalizado, para jugar otra vez pulse Nueva Partida");
				}
			}
		};
		
		Component[] componentes = panel_tablero.getComponents();
		for(int i=0;i<componentes.length;i++) {
			if(componentes[i] instanceof JButton) {
				JButton bot = (JButton)componentes[i];
				bot.addActionListener(ganar);
			}
		}
		
		ActionListener cas_00 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_00) {
				marcar(casilla_00, et_jugando);
			}
		};
		casilla_00.addActionListener(cas_00);
		
		ActionListener cas_01 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_01) {
				marcar(casilla_01, et_jugando);
			}
		};
		casilla_01.addActionListener(cas_01);
		
		ActionListener cas_02 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_02) {
				marcar(casilla_02, et_jugando);
			}
		};
		casilla_02.addActionListener(cas_02);
		
		ActionListener cas_10 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_10) {
				marcar(casilla_10, et_jugando);
			}
		};
		casilla_10.addActionListener(cas_10);
		
		ActionListener cas_11 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_11) {
				marcar(casilla_11, et_jugando);
			}
		};
		casilla_11.addActionListener(cas_11);
		
		ActionListener cas_12 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_12) {
				marcar(casilla_12, et_jugando);
			}
		};
		casilla_12.addActionListener(cas_12);
		
		ActionListener cas_20 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_20) {
				marcar(casilla_20, et_jugando);
			}
		};
		casilla_20.addActionListener(cas_20);
		
		ActionListener cas_21 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_21) {
				marcar(casilla_21, et_jugando);
			}
		};
		casilla_21.addActionListener(cas_21);
		
		ActionListener cas_22 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_22) {
				marcar(casilla_22, et_jugando);
			}
		};
		casilla_22.addActionListener(cas_22);
	}
	
	private boolean esGanador() {
		for(int i=0;i<3;i++) {
			if(tablero[i][0]==tablero[i][1] && tablero[i][0]==tablero[i][2] && tablero[i][0]!=0) {
				return true;
			}else if(tablero[0][i]==tablero[1][i] && tablero[0][i]==tablero[2][i] && tablero[0][i]!=0) {
				return true;
			}
		}
		if((tablero[0][0]==tablero[1][1] && tablero[0][0]==tablero[2][2] && tablero[0][0]!=0) || (tablero[0][2]==tablero[1][1] && tablero[0][2]==tablero[2][0] && tablero[0][2]!=0)){
			return true;
		}
		return false;
	}
	
	private boolean hayTres() {
		int contador1=0, contador2=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(turno==1) {
					if(tablero[i][j]==1) {
						contador1++;
					}
				}else {
					if(tablero[i][j]==2) {
						contador2++;
					}
				}
			}
		}
		if(contador1==3 || contador2==3) {
			return true;
		}
		return false;
	}
	
	private void clearTablero() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				tablero[i][j]=0;
			}
		}
	}
	
	private void marcar(JButton boton, JLabel et_jugando) {
		int fila = Integer.parseInt(Character.toString(boton.getName().charAt(0)));
		int colum = Integer.parseInt(Character.toString(boton.getName().charAt(1)));
		if(turno==1) {
			if(hayTres()) {
				if(tablero[fila][colum]==1) {
					tablero[fila][colum]=0;
					boton.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "Esa casilla no tiene una X");
				}
			}else {
				if(tablero[fila][colum]==0) {
					turno=2;
					tablero[fila][colum]=1;
					boton.setText("X");
					if(textField_jug2.getText().equals("")) {
						et_jugando.setText("Turno del Jugador 2");
					}else {
						et_jugando.setText("Turno de "+textField_jug2.getText());
					}
				}else {
					JOptionPane.showMessageDialog(null, "Esa casilla ya esta ocupada");
				}
			}
		}else {
			if(hayTres()) {
				if(tablero[fila][colum]==2) {
					tablero[fila][colum]=0;
					boton.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "Esa casilla no tiene un O");
				}
			}else {
				if(tablero[fila][colum]==0) {
					turno=1;
					tablero[fila][colum]=2;
					boton.setText("O");
					if(textField_jug1.getText().equals("")) {
						et_jugando.setText("Turno del Jugador 1");
					}else {
						et_jugando.setText("Turno de "+textField_jug1.getText());
					}
				}else {
					JOptionPane.showMessageDialog(null, "Esa casilla ya esta ocupada");
				}
			}
		}
	}
}
