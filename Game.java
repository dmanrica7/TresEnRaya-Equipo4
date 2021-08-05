package EnGrupo.enRaya;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Dimension;


public class Game extends JFrame {

	protected static final String O = null;
	private JPanel contentPane;
	int[]partida = new int[9];
	 int turno =1;
	
	public Game() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
	
		setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
	
		int j1=0, j2=0;
		String x="";
		
		
		final JLabel c1 = new JLabel("<html><div style='text-align: center;'>" + x + "</div></html>", SwingConstants.CENTER);
		c1.setBounds(50,200,100,100);
		contentPane.add(c1);
		c1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if(turno==1) {
					c1.setText("X");
					partida[0]=1;
					turno=2;
				}else {
					c1.setText("O");
					partida[0]=2;
					turno=1;
				}
				tresEnRaya(partida);
				
			}
		});
		
		
		final JLabel c2 = new JLabel("<html><div style='text-align: center;'>" + x + "</div></html>", SwingConstants.CENTER);
		c2.setBounds(200,200,100,100);
		contentPane.add(c2);
		c2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(turno==1) {
					c2.setText("X");
					partida[1]=1;
					turno=2;
				}else {
					c2.setText("O");
					partida[1]=2;
					turno=1;
				}
				tresEnRaya(partida);
				
			}
		});
		
		final JLabel c3 = new JLabel("<html><div style='text-align: center;'>" + x + "</div></html>", SwingConstants.CENTER);
		c3.setBounds(350,200, 100, 100);
		contentPane.add(c3);
		c3.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(turno==1) {
					c3.setText("X");
					partida[2]=1;
					turno=2;
				}else {
					c3.setText("O");
					partida[2]=2;
					turno=1;
				}
				tresEnRaya(partida);
			}
		});
		
		final JLabel c4 = new JLabel("<html><div style='text-align: center;'>" + x + "</div></html>", SwingConstants.CENTER);
		c4.setBounds(50,350,100,100);
		contentPane.add(c4);
		c4.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				if(turno==1) {
					c4.setText("X");
					partida[3]=1;
					turno=2;
				}else {
					c4.setText("O");
					partida[3]=2;
					turno=1;
				}
				tresEnRaya(partida);
			}
		});
		
		
		final JLabel c5 = new JLabel("<html><div style='text-align: center;'>" + x + "</div></html>", SwingConstants.CENTER);
		c5.setBounds(200,350,100,100);
		contentPane.add(c5);
		c5.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(turno==1) {
					c5.setText("X");
					partida[4]=1;
					turno=2;
				}else {
					c5.setText("O");
					partida[4]=2;
					turno=1;
				}
				tresEnRaya(partida);
			}
		});
		
		final JLabel c6 = new JLabel("<html><div style='text-align: center;'>" + x + "</div></html>", SwingConstants.CENTER);
		c6.setBounds(350,350,100,100);
		contentPane.add(c6);
		c6.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(turno==1) {
					c6.setText("X");
					partida[5]=1;
					turno=2;
				}else {
					c6.setText("O");
					partida[5]=2;
					turno=1;
				}
				tresEnRaya(partida);
			}
		});
		
		final JLabel c7 = new JLabel("<html><div style='text-align: center;'>" + x + "</div></html>", SwingConstants.CENTER);
		c7.setBounds(50,500,100,100);
		contentPane.add(c7);
		c7.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(turno==1) {
					c7.setText("X");
					partida[6]=1;
					turno=2;
				}else {
					c7.setText("O");
					partida[6]=2;
					turno=1;
				}
				tresEnRaya(partida);
			}
		});
		
		final JLabel c8 = new JLabel("<html><div style='text-align: center;'>" + x + "</div></html>", SwingConstants.CENTER);
		c8.setBounds(200,500,100,100);
		contentPane.add(c8);
		c8.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(turno==1) {
					c8.setText("X");
					partida[7]=1;
					turno=2;
				}else {
					c8.setText("O");
					partida[7]=2;
					turno=1;
				}
				tresEnRaya(partida);
			}
		});
		
		final JLabel c9 = new JLabel("<html><div style='text-align: center;'>" + x + "</div></html>", SwingConstants.CENTER);
		c9.setBounds(350,500,100,100);
		contentPane.add(c9);
		c9.setBorder(BorderFactory.createLineBorder(Color.black));
		
		c9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(turno==1) {
					c9.setText("X");
					partida[8]=1;
					turno=2;
				}else {
					c9.setText("O");
					partida[8]=2;
					turno=1;
				}
				tresEnRaya(partida);
			}
		});
		
		EventosRaton eventoRaton = new EventosRaton();
		
		addMouseListener(eventoRaton);
		
		
		
	}
	public void mostrarArray(int[]array) {
		
		for(int i=0; i< array.length; i++) {
			System.out.println(array[i]);
			
		}
		
	}
	public void tresEnRaya(int[]array) {
		/*Filas*/
		if(array[0]==1&&array[1]==1&&array[2]==1) {
			JOptionPane.showMessageDialog(null, "Tres en raya del jugador 1");		}
		else if(array[0]==2&&array[1]==2&&array[2]==2) {
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
class EventosRaton extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e) {
			
			System.out.println("HAS HECHO CLICK");
		}
		public void mouseDragged(MouseEvent e) {
					
					System.out.println("Has arrastrado");
				}
		public void mouseExited(MouseEvent e) {
			
			System.out.println("Te has salido del cuadro");
		}
		public void mouseEntered(MouseEvent e) {
			
			System.out.println("Te has metido en el cuadro");
		}
		public void mousePressed(MouseEvent e) {
			
			System.out.println("Estas manteniendo el click");
		}
		public void mouseReleased(MouseEvent e) {
			
			System.out.println("Has soltado el click");
		}
		public void mouseWheelMoved(MouseWheelEvent e) {
			
			System.out.println("Estás moviendo la rueda");
		}
	}
	
	
	
}
