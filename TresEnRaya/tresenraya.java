package idk.TresEnRaya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class tresenraya extends JFrame {

	private JPanel contentPane;
	private JTextField nombreJugador1;
	private JTextField nombreJugador2;
	private boolean turno = true;
	private ArrayList<JButton> botonesJugador1 = new ArrayList<>();
	private ArrayList<JButton> botonesJugador2 = new ArrayList<>();
	private String[][] tablero = new String[3][3];
	JLabel etiquetaJugada = new JLabel("");
	JPanel panelfila1 = new JPanel();
	JPanel panelfila2 = new JPanel();
	JPanel panelfila3 = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tresenraya frame = new tresenraya();
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
	public tresenraya() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		panelfila1.setBounds(10, 11, 454, 128);
		contentPane.add(panelfila1);
		panelfila1.setLayout(new GridLayout(1, 0, 0, 0));

		JButton boton11 = new JButton("");
		boton11.setName("00");
		boton11.setFont(new Font("Tahoma", Font.BOLD, 60));
		boton11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(boton11);
			}
		});
		panelfila1.add(boton11);

		JButton boton12 = new JButton("");
		boton12.setName("01");
		boton12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(boton12);
			}
		});
		boton12.setFont(new Font("Tahoma", Font.BOLD, 60));
		panelfila1.add(boton12);

		JButton boton13 = new JButton("");
		boton13.setName("02");
		boton13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(boton13);
			}
		});
		boton13.setFont(new Font("Tahoma", Font.BOLD, 60));
		panelfila1.add(boton13);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(474, 11, 420, 374);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton botonNewGame = new JButton("Nueva Partida");
		botonNewGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				newGame();
			}
		});
		botonNewGame.setBounds(150, 11, 134, 23);
		panel_1.add(botonNewGame);

		JPanel panelJugador1 = new JPanel();
		panelJugador1.setBounds(10, 72, 400, 140);
		panel_1.add(panelJugador1);
		panelJugador1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Jugador 1");
		lblNewLabel.setBounds(10, 11, 79, 14);
		panelJugador1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(10, 36, 79, 14);
		panelJugador1.add(lblNewLabel_1);

		nombreJugador1 = new JTextField();
		nombreJugador1.setBounds(113, 33, 86, 20);
		panelJugador1.add(nombreJugador1);
		nombreJugador1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Tipo");
		lblNewLabel_2.setBounds(10, 90, 46, 14);
		panelJugador1.add(lblNewLabel_2);

		JRadioButton botonHumano1 = new JRadioButton("Humano");
		botonHumano1.setSelected(true);
		botonHumano1.setBounds(53, 86, 72, 23);
		panelJugador1.add(botonHumano1);

		JRadioButton botonCPU1 = new JRadioButton("CPU");
		botonCPU1.setBounds(127, 86, 72, 23);
		panelJugador1.add(botonCPU1);

		JPanel panelJugador2 = new JPanel();
		panelJugador2.setBounds(10, 223, 400, 140);
		panel_1.add(panelJugador2);
		panelJugador2.setLayout(null);

		JLabel lblJugador = new JLabel("Jugador 2");
		lblJugador.setBounds(10, 11, 79, 14);
		panelJugador2.add(lblJugador);

		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setBounds(10, 36, 79, 14);
		panelJugador2.add(lblNewLabel_1_1);

		nombreJugador2 = new JTextField();
		nombreJugador2.setBounds(113, 33, 86, 20);
		panelJugador2.add(nombreJugador2);
		nombreJugador2.setColumns(10);

		JLabel lblNewLabel_2_1 = new JLabel("Tipo");
		lblNewLabel_2_1.setBounds(10, 90, 46, 14);
		panelJugador2.add(lblNewLabel_2_1);

		JRadioButton botonHumano2 = new JRadioButton("Humano");
		botonHumano2.setSelected(true);
		botonHumano2.setBounds(53, 86, 72, 23);
		panelJugador2.add(botonHumano2);

		JRadioButton botonCPU2 = new JRadioButton("CPU");
		botonCPU2.setBounds(127, 86, 72, 23);
		panelJugador2.add(botonCPU2);

		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(botonHumano1);
		grupo1.add(botonCPU1);

		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(botonHumano2);
		grupo2.add(botonCPU2);

		etiquetaJugada.setBounds(10, 48, 400, 14);
		panel_1.add(etiquetaJugada);

		
		panelfila2.setBounds(10, 139, 454, 119);
		contentPane.add(panelfila2);
		panelfila2.setLayout(new GridLayout(1, 0, 0, 0));

		JButton boton21 = new JButton("");
		boton21.setName("10");
		boton21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(boton21);
			}
		});
		boton21.setFont(new Font("Tahoma", Font.BOLD, 60));
		panelfila2.add(boton21);

		JButton boton22 = new JButton("");
		boton22.setName("11");
		boton22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(boton22);
			}
		});
		boton22.setFont(new Font("Tahoma", Font.BOLD, 60));
		panelfila2.add(boton22);

		JButton boton23 = new JButton("");
		boton23.setName("12");
		boton23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(boton23);
			}
		});
		boton23.setFont(new Font("Tahoma", Font.BOLD, 60));
		panelfila2.add(boton23);

		panelfila3.setBounds(10, 258, 454, 127);
		contentPane.add(panelfila3);
		panelfila3.setLayout(new GridLayout(1, 0, 0, 0));

		JButton boton31 = new JButton("");
		boton31.setName("20");
		boton31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(boton31);
			}
		});
		boton31.setFont(new Font("Tahoma", Font.BOLD, 60));
		panelfila3.add(boton31);

		JButton boton32 = new JButton("");
		boton32.setName("21");
		boton32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(boton32);
			}
		});
		boton32.setFont(new Font("Tahoma", Font.BOLD, 60));
		boton32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelfila3.add(boton32);

		JButton boton33 = new JButton("");
		boton33.setName("22");
		boton33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(boton33);
			}
		});
		boton33.setFont(new Font("Tahoma", Font.BOLD, 60));
		panelfila3.add(boton33);
	}

	private void marcar(JButton boton) {
		int i = Integer.parseInt(boton.getName().valueOf(boton.getName().charAt(0)));
		int j = Integer.parseInt(boton.getName().valueOf(boton.getName().charAt(1)));
		if (turno) {

//				Si lo está desmarcamos el botón seleccionado
			if (botonesJugador1.size() == 3) {
				if (botonesJugador1.contains(boton)) {
					botonesJugador1.remove(boton);
					boton.setText("");
				}
			} else {
				tablero[i][j] = "X";
				botonesJugador1.add(boton);
				boton.setText("X");
				esGanador();
				turno = false;
				etiquetaJugada.setText("Turno de " + nombreJugador2.getText());
			}
			
		} else {
//				Si lo está desmarcamos el botón seleccionado
			if (botonesJugador2.size() == 3) {
				if (botonesJugador2.contains(boton)) {
					botonesJugador2.remove(boton);
					boton.setText("");
				}
			} else {
				tablero[i][j] = "Y";
				botonesJugador2.add(boton);
				boton.setText("Y");
				esGanador();
				turno = true;
				etiquetaJugada.setText("Turno de " + nombreJugador1.getText());
			}
		}

	}

	private void esGanador() {
		for (int i = 0; i < 3; i++) {
			if (tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2] && tablero[i][0] != null) {
				JOptionPane.showMessageDialog(null, "Felicidades! Has ganado!");
			} else if (tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i] && tablero[0][i] != null) {
				JOptionPane.showMessageDialog(null, "Felicidades! Has ganado!");
			}
		}
		if ((tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2] && tablero[0][0] != null)
				|| (tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0] && tablero[0][2] != null)) {
			JOptionPane.showMessageDialog(null, "Felicidades! Has ganado!");
		}
	}
	
	private void newGame() {
//		Cleareamos el array del tablero y los de jugadores
		tablero = new String[3][3];
		botonesJugador1.clear();
		botonesJugador2.clear();
		turno = true;
		Component[] fila1 = panelfila1.getComponents();
		Component[] fila2 = panelfila2.getComponents();
		Component[] fila3 = panelfila3.getComponents();
		for (int i = 0; i < fila1.length; i++) {
			if(fila1[i] instanceof JButton) {
				JButton boton1 = (JButton)fila1[i];
				JButton boton2 = (JButton)fila2[i];
				JButton boton3 = (JButton)fila3[i];
				boton1.setText("");
				boton2.setText("");
				boton3.setText("");
			}
		}
		
	}
}
