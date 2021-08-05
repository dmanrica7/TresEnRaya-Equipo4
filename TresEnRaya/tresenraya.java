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
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class tresenraya extends JFrame {

	private JPanel contentPane;
	private JTextField nombreJugador1;
	private JTextField nombreJugador2;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 454, 128);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton botonA1 = new JButton("");
		botonA1.setFont(new Font("Tahoma", Font.BOLD, 60));
		botonA1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(botonA1);
			}
		});
		panel.add(botonA1);
		
		JButton botonB1 = new JButton("");
		botonB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(botonB1);
			}
		});
		botonB1.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel.add(botonB1);
		
		JButton botonC1 = new JButton("");
		botonC1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(botonC1);
			}
		});
		botonC1.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel.add(botonC1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(474, 11, 420, 374);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Nueva Partida");
		btnNewButton.setBounds(150, 11, 134, 23);
		panel_1.add(btnNewButton);
		
		JPanel panelJugador1 = new JPanel();
		panelJugador1.setBounds(10, 72, 400, 140);
		panel_1.add(panelJugador1);
		panelJugador1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jugador 1");
		lblNewLabel.setBounds(10, 11, 79, 14);
		panelJugador1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		panelJugador1.add(lblNewLabel_1);
		
		nombreJugador1 = new JTextField();
		nombreJugador1.setBounds(66, 33, 86, 20);
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
		lblNewLabel_1_1.setBounds(10, 36, 46, 14);
		panelJugador2.add(lblNewLabel_1_1);
		
		nombreJugador2 = new JTextField();
		nombreJugador2.setBounds(66, 36, 86, 20);
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
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 48, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 139, 454, 119);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton botonA2 = new JButton("");
		botonA2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(botonA2);
			}
		});
		botonA2.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel_2.add(botonA2);
		
		JButton botonB2 = new JButton("");
		botonB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(botonB2);
			}
		});
		botonB2.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel_2.add(botonB2);
		
		JButton botonC2 = new JButton("");
		botonC2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(botonC2);
			}
		});
		botonC2.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel_2.add(botonC2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 258, 454, 127);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton botonA3 = new JButton("");
		botonA3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(botonA3);
			}
		});
		botonA3.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel_3.add(botonA3);
		
		JButton botonB3 = new JButton("");
		botonB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(botonB3);
			}
		});
		botonB3.setFont(new Font("Tahoma", Font.BOLD, 60));
		botonB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(botonB3);
		
		JButton botonC3 = new JButton("");
		botonC3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcar(botonC3);
			}
		});
		botonC3.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel_3.add(botonC3);
	}
	
	public void marcar(JButton boton) {
		if(true) {
			boton.setText("X");
		} else {
			boton.setText("Y");
		}
	}
}
