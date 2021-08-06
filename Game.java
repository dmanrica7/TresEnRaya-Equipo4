package EnGrupo.enRaya;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JTextField;


public class Game extends JFrame {

	protected static final String O = null;
	private JPanel contentPane;
	int[]partida = new int[9];
	 int turno =1;
	 ArrayList<String> uno = new ArrayList<String>();
	 ArrayList<String> dos = new ArrayList<String>();
	 private JTextField textField;
	 private JTextField textField_1;

	
	public Game() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		contentPane = new JPanel();
	
		setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		contentPane.setBackground(Color.white); 
		
		JRadioButton versusJ = new JRadioButton("JcJ", true);
		versusJ.setBounds(505,253,125,50);
		contentPane.add(versusJ);
		
		JRadioButton versusCPU = new JRadioButton("CPU", true);
		versusCPU.setBounds(628,253,125,50);
		contentPane.add(versusCPU);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(versusJ);
		bgroup.add(versusCPU);
		
		
		JRadioButton versusJ_1 = new JRadioButton("JcJ", true);
		versusJ_1.setBounds(505, 453, 125, 50);
		contentPane.add(versusJ_1);
		
		JRadioButton versusCPU_1 = new JRadioButton("CPU", true);
		versusCPU_1.setBounds(628, 453, 125, 50);
		contentPane.add(versusCPU_1);
		
		ButtonGroup bgroup2 = new ButtonGroup();
		bgroup.add(versusJ_1);
		bgroup.add(versusCPU_1);
		
		
		versusJ.setBackground(Color.white);
		versusCPU.setBackground(Color.white);
		versusJ_1.setBackground(Color.white);
		versusCPU_1.setBackground(Color.white);
		
		
		JLabel lblNewLabel = new JLabel("Jugador 1");
		lblNewLabel.setBounds(505, 176, 125, 38);
		contentPane.add(lblNewLabel);
		
		JLabel nombre = new JLabel("Nombre: ");
		nombre.setBounds(505, 225, 55, 26);
		contentPane.add(nombre);
		
		textField = new JTextField();
		textField.setBounds(563, 225, 125, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel nombre2 = new JLabel("Nombre: ");
		nombre2.setBounds(505, 424, 55, 26);
		contentPane.add(nombre2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(563, 427, 125, 23);
		contentPane.add(textField_1);
		
		/*casillas*/
		
		
		final JLabel c1 = new JLabel("<html><div style='text-align: center;'>" + "" + "</div></html>", SwingConstants.CENTER);
		c1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		c1.setBounds(50,200,100,100);
		contentPane.add(c1);
		c1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int cas =1;
				turno =comprobaciones(c1, partida, turno, cas, uno, dos);
				tresEnRaya(partida);
				
				
			}
		});
		
		
		final JLabel c2 = new JLabel("<html><div style='text-align: center;'>" + "" + "</div></html>", SwingConstants.CENTER);
		c2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		c2.setBounds(200,200,100,100);
		contentPane.add(c2);
		c2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int cas=2;
				turno=comprobaciones(c2, partida, turno, cas, uno, dos);
				tresEnRaya(partida);
				
			}
		});
		
		final JLabel c3 = new JLabel("<html><div style='text-align: center;'>" + "" + "</div></html>", SwingConstants.CENTER);
		c3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		c3.setBounds(350,200, 100, 100);
		contentPane.add(c3);
		c3.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int cas=3;
				turno=comprobaciones(c3, partida, turno, cas, uno, dos);
				tresEnRaya(partida);
				
			}
		});
		
		final JLabel c4 = new JLabel("<html><div style='text-align: center;'>" + "" + "</div></html>", SwingConstants.CENTER);
		c4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		c4.setBounds(50,350,100,100);
		contentPane.add(c4);
		c4.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int cas=4;

				turno=comprobaciones(c4, partida, turno, cas, uno, dos);
				tresEnRaya(partida);
			}
		});
		
		
		final JLabel c5 = new JLabel("<html><div style='text-align: center;'>" + "" + "</div></html>", SwingConstants.CENTER);
		c5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		c5.setBounds(200,350,100,100);
		contentPane.add(c5);
		c5.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int cas =5;
				turno=comprobaciones(c5, partida, turno, cas, uno, dos);
				tresEnRaya(partida);
			}
		});
		
		final JLabel c6 = new JLabel("<html><div style='text-align: center;'>" + "" + "</div></html>", SwingConstants.CENTER);
		c6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		c6.setBounds(350,350,100,100);
		contentPane.add(c6);
		c6.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int cas =6;
				turno=comprobaciones(c6, partida, turno, cas, uno, dos);
				tresEnRaya(partida);
			}
		});
		
		final JLabel c7 = new JLabel("<html><div style='text-align: center;'>" + "" + "</div></html>", SwingConstants.CENTER);
		c7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		c7.setBounds(50,500,100,100);
		contentPane.add(c7);
		c7.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int cas =7;
				turno=comprobaciones(c7, partida, turno, cas, uno, dos);
				tresEnRaya(partida);
			}
		});
		
		final JLabel c8 = new JLabel("<html><div style='text-align: center;'>" + "" + "</div></html>", SwingConstants.CENTER);
		c8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		c8.setBounds(200,500,100,100);
		contentPane.add(c8);
		c8.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int cas =8;
				turno=comprobaciones(c8, partida, turno, cas, uno, dos);
				tresEnRaya(partida);
			}
		});
		
		final JLabel c9 = new JLabel("<html><div style='text-align: center;'>" + "" + "</div></html>", SwingConstants.CENTER);
		c9.setFont(new Font("Tahoma", Font.PLAIN, 40));
		c9.setBounds(350,500,100,100);
		contentPane.add(c9);
		c9.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblJugador = new JLabel("Jugador 2");
		lblJugador.setBounds(505, 375, 125, 38);
		contentPane.add(lblJugador);
		
		
		
		c9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int cas =9;
				turno=comprobaciones(c9, partida, turno, cas, uno, dos);
				tresEnRaya(partida);
			}
		});
				
		
		}
		
		
		
		
		
		
	public void mostrarArray(int[]array) {
		
		for(int i=0; i< array.length; i++) {
			System.out.println(array[i]);
			
		}
		
	}

	public void tresEnRaya(int[]array) {
		/*Filas*/
		if(array[0]==1&&array[1]==1&&array[2]==1) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 1");
		}else if(array[0]==2&&array[1]==2&&array[2]==2) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 2");
		}else if(array[3]==1&&array[4]==1&&array[5]==1) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 1");
		}else if(array[3]==2&&array[4]==2&&array[5]==2) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 2");
		}else if(array[6]==1&&array[7]==1&&array[8]==1) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 1");
		}else if(array[6]==2&&array[7]==2&&array[8]==2) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 2");
		}/*Columnas*/
		else if(array[0]==1&&array[3]==1&&array[6]==1) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 1");
		}else if(array[0]==2&&array[3]==2&&array[6]==2) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 2");
		}else if(array[1]==1&&array[4]==1&&array[7]==1) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 1");
		}else if(array[1]==2&&array[4]==2&&array[7]==2) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 2");
		}else if(array[2]==1&&array[5]==1&&array[8]==1) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 1");
		}else if(array[2]==2&&array[5]==2&&array[8]==2) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 2");
			/*Diagonales*/
		}else if(array[0]==1&&array[4]==1&&array[8]==1) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 1");
		}else if(array[0]==2&&array[4]==2&&array[8]==2) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 2");
		}else if(array[2]==1&&array[4]==1&&array[6]==1) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 1");
		}else if(array[2]==2&&array[4]==2&&array[6]==2) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 2");
		}
	}
	public int comprobaciones(JLabel c, int []partida, int turno, int cas,ArrayList<String> uno, ArrayList<String> dos) {
		JLabel turnoDe=new JLabel();
		JOptionPane.showMessageDialog(null,"hola");
		switch(turno) {
		
		case 1:
			
			turnoDe = new JLabel(textField.getText()+", es tu turno.");
			 turnoDe.setBounds(505,120,150,50);
			contentPane.add(turnoDe);
			break;
		case 2: 
			turnoDe = new JLabel(textField_1.getText()+", es tu turno.");
			turnoDe.setBounds(505,120,150,50);
			contentPane.add(turnoDe);
			break;
			
		}
		
		if(turno==1) {
			
			 if(partida[cas-1]==0&&uno.size()<3) {
				 
			c.setText("X");
			partida[cas-1]=1;
			uno.add("x");
			return turno=2;
			
			 }else {
				 c.setText("");
			 partida[cas-1]=0;
			 uno.remove(1);
			 }
			 
		}
		else if(turno==2) {
			 if(partida[cas-1]==0&&dos.size()<3) {
					c.setText("O");
					partida[cas-1]=2;
					dos.add("o");
					return turno=1;
			 }else {
				 c.setText("");
				 partida[cas-1]=0;
				 dos.remove(1);
			 }
			 

		}
		return turno;
		
	}
}
