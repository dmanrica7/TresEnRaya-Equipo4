package metodos;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Metodos {
	
	public Metodos() {
	}
	
	public boolean esGanador(int[][] tablero, int turno, JTextField textField_jug1, JTextField textField_jug2, JLabel et_jug1, JLabel et_jug2, JLabel comentario) {
		
		/*
		 * Metodo que comprueba si algun jugador ha ganado, si es el caso muestra los mensajes correspondientes y para la partida
		 */
		
		boolean ganado=false; // Seteamos una variable bool a false, si a lo largo del codigo no se cambia es que todavia no ha ganado nadie
		// Recorremos las filas y las columnas del tablero
		for(int i=0;i<3;i++) {
			// Este if comprueba las filas por si coinciden los tres elementos y no estan vacios
			if(tablero[i][0]==tablero[i][1] && tablero[i][0]==tablero[i][2] && tablero[i][0]!=0) {
				ganado = true;
			// Este else if hace lo mismo pero para las columnas
			}else if(tablero[0][i]==tablero[1][i] && tablero[0][i]==tablero[2][i] && tablero[0][i]!=0) {
				ganado = true;
			}
		}
		// Ahpra falta comprobar las diagonales
		if((tablero[0][0]==tablero[1][1] && tablero[0][0]==tablero[2][2] && tablero[0][0]!=0) || (tablero[0][2]==tablero[1][1] && tablero[0][2]==tablero[2][0] && tablero[0][2]!=0)){
			ganado = true;
		}
		// Si en el codigo anterior no se ha cambiado la variable ganado acabariamos aqui y no entrariamos en el if siguiente
		if(ganado==true) {
			if(turno==1) {
				// Si estamos en el turno 1 quiere decir que el jugador 2 es el que acaba de hacer su movimiento
				// Por lo tanto el ganandor es el jugador 2
				if(textField_jug2.getText().equals("")) {
					// Usamos la etiqueta de Jugadar 2 si el alias esta vacio
					JOptionPane.showMessageDialog(null, "¡Gana "+et_jug2.getText()+"!");						
				}else {
					// Si hay alias, lo usamos
					JOptionPane.showMessageDialog(null, "¡Gana "+textField_jug2.getText()+"!");						
				}
			}else {
				// Si estamos en el turno 2 quiere decir que el jugador 1 es el que acaba de hacer su movimiento
				// Por lo tanto el ganandor es el jugador 1
				if(textField_jug1.getText().equals("")) {
					// Usamos la etiqueta de Jugadar 1 si el alias esta vacio
					JOptionPane.showMessageDialog(null, "¡Gana "+et_jug1.getText()+"!");						
				}else {
					// Si hay alias, lo usamos
					JOptionPane.showMessageDialog(null, "¡Gana "+textField_jug1.getText()+"!");						
				}
			}
			// Seteamos el comentario de juego indicando las proximas acciones
			comentario.setText("Para jugar otra vez limpie el tablero y pulse Jugar");
			// Indicamos que la partida ha acabado
			return false;
		}
		return true;
	}
	
	public boolean hayTres(int turno, int[][] tablero) {
		
		/*
		 * Metodo para comprobar si los jugadores ya tienen tres fichas en el tablero, en ese caso retornamos true y haremos las
		 * consiguientes operaciones. Si no es el caso retornamos false
		 */
		
		int contador1=0, contador2=0; // Inicializamos un contador para cada jugador a cero
		// Recorremos las filas
		for(int i=0;i<3;i++) {
			// Recorremos las columnas
			for(int j=0;j<3;j++) {
				// Si el turno es del jugador 1 tendremos que contar unos en el tablero
				if(turno==1) {
					if(tablero[i][j]==1) {
						contador1++;
					}
				// Si el turno es del jugador 2 tendremos que contar doses en el tablero
				}else {
					if(tablero[i][j]==2) {
						contador2++;
					}
				}
			}
		}
		// Si alguno de los contadores llega a tres retornamos true 
		if(contador1==3 || contador2==3) {
			// Ponemos una igualdad como operador porque con este metodo nunca se superará ese maximo de 3
			return true;
		}
		// Si no es el caso, retornamos false
		return false;
	}
	
	public void clearTablero(int[][] tablero, JPanel panel_tablero) {
		
		/*
		 *  Metodo para limpiar todo el tablero y las casillas
		 */
		
		// Recorremos toda la matriz y seteamos a cero
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				tablero[i][j]=0;
			}
		}
		// Cogemos todas las componentes del tablero (todos los botones de las casillas)
		Component[] componentes = panel_tablero.getComponents();
		for(int i=0;i<componentes.length;i++) {
			// En cada boton borramos lo que hubiera escrito
			if(componentes[i] instanceof JButton) {
				JButton bot = (JButton)componentes[i];
				bot.setText("");
			}
		}
	}
}
