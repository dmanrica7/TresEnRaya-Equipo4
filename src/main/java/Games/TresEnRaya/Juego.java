package Games.TresEnRaya;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.SwingConstants;

public class Juego extends JFrame {
	
	/*
	 *  Atributos de Clase
	 */
	
	// Guarda todos los subpanales
	private JPanel contentPane;
	// Guarda los botones con las casillas del tablero
	private JPanel panel_tablero;
	// Guarda los paneles de los datos de los jugadores, así como los botones de iniciar partida y limpiar tablero
	private JPanel panel_datos;
	// Guarda los datos del jugador uno
	private JPanel panel_jug1;
	// Guarda los datos del jugador dos
	private JPanel panel_jug2;
	// Guarda el nombre del jugador 1
	private JTextField textField_jug1;
	// Guarda el nombre del jugador 2
	private JTextField textField_jug2;
	// Guarda la etiqueta del comentario de juego
	private JLabel comentario;
	// Guardan Jugador 1 y 2 respectivamente
	private JLabel et_jug1;
	private JLabel et_jug2;
	// Boolean que nos indica si hay una partida en juego o no
	private boolean jugando;
	// Matriz con el valor de cada casilla (0: vacia, 1: X, 2: O)
	private int[][] tablero;
	// Entero que nos indica de quien es el turno para jugar
	private int turno;

	/*
	 *  Metodo para crear la ventana del juego y setearla a visible
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

	/*
	 *  Constructor
	 */
	
	public Juego() {
		
		/*
		 *  Inicializamos las varibles a su estado inicial
		 */
		
		this.jugando=false; // Hasta que no presionemos Jugar este atributo sera false
		this.turno = 1; // Empezamos con el jugador 1
		this.tablero = new int[3][3]; // Por defecto se inicializan a 0, es decir, la casilla estara vacia
		
		/*
		 *  Creamos el diseño de la ventana añadiendo todas las componentes
		 */
		
		// Caracteristicas basicas de la ventana
		setTitle("Tres en Raya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 496);
		
		// El panel con todos los elementos
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// El panel con las casillas que forman el tablero
		panel_tablero = new JPanel();
		panel_tablero.setBounds(2, 2, 400, 455);
		contentPane.add(panel_tablero);
		panel_tablero.setLayout(new GridLayout(3, 3, 0, 0));
		
		// Cada casilla sera un boton con unas coordenadas que corresponderan al elemento de la matriz con las mismas coordenadas
		
		JButton casilla_00 = new JButton("");
		casilla_00.setName("00"); // Le damos las coordenadas 00 para identificarla
		casilla_00.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_00);
		
		JButton casilla_01 = new JButton("");
		casilla_01.setName("01"); // Le damos las coordenadas 01 para identificarla
		casilla_01.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_01);
		
		JButton casilla_02 = new JButton("");
		casilla_02.setName("02"); // Le damos las coordenadas 02 para identificarla
		casilla_02.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_02);
		
		JButton casilla_10 = new JButton("");
		casilla_10.setName("10"); // Le damos las coordenadas 10 para identificarla
		casilla_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_10);
		
		JButton casilla_11 = new JButton("");
		casilla_11.setName("11"); // Le damos las coordenadas 11 para identificarla
		casilla_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_11);
		
		JButton casilla_12 = new JButton("");
		casilla_12.setName("12"); // Le damos las coordenadas 12 para identificarla
		casilla_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_12);
		
		JButton casilla_20 = new JButton("");
		casilla_20.setName("20"); // Le damos las coordenadas 20 para identificarla
		casilla_20.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_20);
		
		JButton casilla_21 = new JButton("");
		casilla_21.setName("21"); // Le damos las coordenadas 21 para identificarla
		casilla_21.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_21);
		
		JButton casilla_22 = new JButton("");
		casilla_22.setName("22"); // Le damos las coordenadas 22 para identificarla
		casilla_22.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_tablero.add(casilla_22);
		
		// Panel con los datos de los jugadores, los botones de inicio y limpiar tablero y el comentario de juego
		panel_datos = new JPanel();
		panel_datos.setBounds(410, 2, 400, 455);
		contentPane.add(panel_datos);
		panel_datos.setLayout(null);
		
		// Boton para limpiar el tablero, setea los elementos de la matriz a 0 y las casillas a cadena vacia 
		JButton limpiar_tablero = new JButton("Limpiar Tablero");
		limpiar_tablero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		limpiar_tablero.setBounds(219, 10, 157, 27);
		limpiar_tablero.setAlignmentY(Component.TOP_ALIGNMENT);
		limpiar_tablero.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_datos.add(limpiar_tablero);
		
		// Boton para iniciar el juego
		JButton empezar_juego = new JButton("Jugar");
		empezar_juego.setFont(new Font("Tahoma", Font.PLAIN, 12));
		empezar_juego.setBounds(10, 11, 157, 27);
		panel_datos.add(empezar_juego);
		
		// Comentario que indica la accion a realizar
		comentario = new JLabel("Para empezar pulse Jugar ");
		comentario.setHorizontalAlignment(SwingConstants.CENTER);
		comentario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comentario.setBounds(10, 41, 380, 33);
		panel_datos.add(comentario);
		
		// Panel con los datos del jugador 1
		panel_jug1 = new JPanel();
		panel_jug1.setBounds(0, 74, 400, 166);
		panel_datos.add(panel_jug1);
		
		// Etiqueta que indica que ficha utilliza el jugador 1
		et_jug1 = new JLabel("Jugador 1 (X)");
		et_jug1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		et_jug1.setBounds(10, 10, 96, 32);
		panel_jug1.add(et_jug1);
		
		// Etiqueta que indica donde escribir el nombre del jugador 1
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 37, 63, 29);
		panel_jug1.add(lblNewLabel_1);
		
		// Boton seleccionable para que el Jugador 1 juegue como usuario
		JRadioButton hum_1 = new JRadioButton("Humano");
		hum_1.setSelected(true);
		hum_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		hum_1.setBounds(62, 120, 75, 21);
		panel_jug1.add(hum_1);
		
		// Boton seleccionable para que el Jugador 1 juegue como CPU
		JRadioButton cpu_1 = new JRadioButton("CPU");
		cpu_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cpu_1.setBounds(139, 121, 50, 21);
		panel_jug1.setLayout(null);
		panel_jug1.add(cpu_1);
		
		// Añadimos los botones anteriores a un grupo para que solo se puede seleccionar uno
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(hum_1);
		bgroup.add(cpu_1);		
		
		// Etiqueta que nos indica que los RadioButtons significan el tipo de Jugador
		JLabel lblNewLabel_5 = new JLabel("Tipo:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(20, 114, 50, 32);
		panel_jug1.add(lblNewLabel_5);
		
		// Campo de texto para que se escriba un alias para el Jugador 1
		textField_jug1 = new JTextField();
		textField_jug1.setBounds(81, 43, 96, 19);
		textField_jug1.setColumns(10);
		panel_jug1.add(textField_jug1);
		
		// Panel con los datos del Jugador 2
		panel_jug2 = new JPanel();
		panel_jug2.setBounds(0, 250, 400, 205);
		panel_jug2.setLayout(null);
		panel_datos.add(panel_jug2);
		
		// Etiqueta que nos indica con que fichas juega el jugador 2
		et_jug2 = new JLabel("Jugador 2 (O)");
		et_jug2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		et_jug2.setBounds(10, 10, 96, 32);
		panel_jug2.add(et_jug2);
		
		// Etiqueta que indica donde escribir el nombre del jugador 2
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(20, 37, 63, 29);
		panel_jug2.add(lblNewLabel_3);
		
		// Campo de texto para escribir el alias del jugador 2
		textField_jug2 = new JTextField();
		textField_jug2.setBounds(81, 43, 96, 19);
		panel_jug2.add(textField_jug2);
		textField_jug2.setColumns(10);
		
		// Etiqueta que nos indica que los RadioButtons significan el tipo de Jugador
		JLabel lblNewLabel_4 = new JLabel("Tipo:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(20, 114, 50, 32);
		panel_jug2.add(lblNewLabel_4);
		
		// Boton seleccionable para que el jugador 2 juege como usuario
		JRadioButton humano_2 = new JRadioButton("Humano");
		humano_2.setSelected(true);
		humano_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		humano_2.setBounds(62, 120, 75, 21);
		panel_jug2.add(humano_2);
		
		// Boton seleccionable para que el jugador 2 juege como cpu
		JRadioButton cpu_2 = new JRadioButton("CPU");
		cpu_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cpu_2.setBounds(139, 121, 50, 21);
		panel_jug2.add(cpu_2);
		
		// Agrupamos los botones para que solo se puede seleccionar uno
		ButtonGroup bgroup_1 = new ButtonGroup();
		bgroup_1.add(cpu_2);
		bgroup_1.add(humano_2);
		
		/*
		 *  Creamos la accion para cada boton
		 */
		
		// Accion para empezar una partida
		ActionListener play = new ActionListener() {
			public void actionPerformed(ActionEvent play) {
				// Activamos la variable jugando
				jugando=true;
				// Empezamos por el jugador 1
				turno=1;
				// Indicamos de quien es el turno
				if(textField_jug1.getText().equals("")) {
					// Si el campo de texto esta vacio usamos la etiqueta de jugador 1 
					comentario.setText("Turno del "+et_jug1);
				}else {
					// Si el jugador tiene un alias, lo usamos
					comentario.setText("Turno de "+textField_jug1.getText());
				}
				// Estudiamos si jugamos con cpu o con usuario
				if(cpu_1.isSelected()) {
					// Como empezamos por el turno 1 miramos el boton cpu_1
					 if(cpu_2.isSelected()) {
						 // Si el cpu_2 tambien esta seleccionado creamos una partida entre cpu's
						 while(jugando==true) {
							 movimiento_cpu();
							 // Comprobamos si alguien ha ganado en cada turno
							 esGanador();
						 }
					 }else {
						 // Si el cpu_2 no esta seleccionado hacemos el primero movimiento de cpu y esperamos al turno del jugador 2
						 movimiento_cpu();
					 }
				}
				
			}
		};
		empezar_juego.addActionListener(play); // Añadimos la accion al boton
		
		// Accion para limpiar el tablero
		ActionListener clean_board = new ActionListener() {
			public void actionPerformed(ActionEvent clean_board) {
				// Seteamos la matriz a ceros y las casillas a cadena vacia
				clearTablero();
				// Indicamos que ahora puede volver a jugar
				comentario.setText("Para empezar pulse Jugar");
			}
		};
		limpiar_tablero.addActionListener(clean_board); // Añadimos la accion al boton
		
		// Para cada casilla añadimos la funcionalidad
		
		ActionListener cas_00 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_00) {
				// Si se clica una casilla realizamos la correspondiente accion
				marcar(casilla_00);
				// Comprobamos si se ha ganado
				esGanador();
				// Si se ha ganado, jugando sera false y no seguiremos
				if(jugando==true) {
					// Mientras no se gane y el turno sea de la cpu realizamos el movimiento y comprobamos si se ha ganado
					if((cpu_1.isSelected() && turno==1) || (cpu_2.isSelected() && turno==2)) {
						movimiento_cpu();
						esGanador();
					}
				}
			}
		};
		casilla_00.addActionListener(cas_00);
		
		ActionListener cas_01 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_01) {
				// Si se clica una casilla realizamos la correspondiente accion
				marcar(casilla_01);
				// Comprobamos si se ha ganado
				esGanador();
				// Si se ha ganado, jugando sera false y no seguiremos
				if(jugando==true) {
					// Mientras no se gane y el turno sea de la cpu realizamos el movimiento y comprobamos si se ha ganado
					if((cpu_1.isSelected() && turno==1) || (cpu_2.isSelected() && turno==2)) {
						movimiento_cpu();
						esGanador();
					}
				}
			}
		};
		casilla_01.addActionListener(cas_01);
		
		ActionListener cas_02 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_02) {
				// Si se clica una casilla realizamos la correspondiente accion
				marcar(casilla_02);
				// Comprobamos si se ha ganado
				esGanador();
				// Si se ha ganado, jugando sera false y no seguiremos
				if(jugando==true) {
					// Mientras no se gane y el turno sea de la cpu realizamos el movimiento y comprobamos si se ha ganado
					if((cpu_1.isSelected() && turno==1) || (cpu_2.isSelected() && turno==2)) {
						movimiento_cpu();
						esGanador();
					}
				}
			}
		};
		casilla_02.addActionListener(cas_02);
		
		ActionListener cas_10 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_10) {
				// Si se clica una casilla realizamos la correspondiente accion
				marcar(casilla_10);
				// Comprobamos si se ha ganado
				esGanador();
				// Si se ha ganado, jugando sera false y no seguiremos
				if(jugando==true) {
					// Mientras no se gane y el turno sea de la cpu realizamos el movimiento y comprobamos si se ha ganado
					if((cpu_1.isSelected() && turno==1) || (cpu_2.isSelected() && turno==2)) {
						movimiento_cpu();
						esGanador();
					}
				}
			}
		};
		casilla_10.addActionListener(cas_10);
		
		ActionListener cas_11 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_11) {
				// Si se clica una casilla realizamos la correspondiente accion
				marcar(casilla_11);
				// Comprobamos si se ha ganado
				esGanador();
				// Si se ha ganado, jugando sera false y no seguiremos
				if(jugando==true) {
					// Mientras no se gane y el turno sea de la cpu realizamos el movimiento y comprobamos si se ha ganado
					if((cpu_1.isSelected() && turno==1) || (cpu_2.isSelected() && turno==2)) {
						movimiento_cpu();
						esGanador();
					}
				}
			}
		};
		casilla_11.addActionListener(cas_11);
		
		ActionListener cas_12 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_12) {
				// Si se clica una casilla realizamos la correspondiente accion
				marcar(casilla_12);
				// Comprobamos si se ha ganado
				esGanador();
				// Si se ha ganado, jugando sera false y no seguiremos
				if(jugando==true) {
					// Mientras no se gane y el turno sea de la cpu realizamos el movimiento y comprobamos si se ha ganado
					if((cpu_1.isSelected() && turno==1) || (cpu_2.isSelected() && turno==2)) {
						movimiento_cpu();
						esGanador();
					}
				}
			}
		};
		casilla_12.addActionListener(cas_12);
		
		ActionListener cas_20 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_20) {
				// Si se clica una casilla realizamos la correspondiente accion
				marcar(casilla_20);
				// Comprobamos si se ha ganado
				esGanador();
				// Si se ha ganado, jugando sera false y no seguiremos
				if(jugando==true) {
					// Mientras no se gane y el turno sea de la cpu realizamos el movimiento y comprobamos si se ha ganado
					if((cpu_1.isSelected() && turno==1) || (cpu_2.isSelected() && turno==2)) {
						movimiento_cpu();
						esGanador();
					}
				}
			}
		};
		casilla_20.addActionListener(cas_20);
		
		ActionListener cas_21 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_21) {
				// Si se clica una casilla realizamos la correspondiente accion
				marcar(casilla_21);
				// Comprobamos si se ha ganado
				esGanador();
				// Si se ha ganado, jugando sera false y no seguiremos
				if(jugando==true) {
					// Mientras no se gane y el turno sea de la cpu realizamos el movimiento y comprobamos si se ha ganado
					if((cpu_1.isSelected() && turno==1) || (cpu_2.isSelected() && turno==2)) {
						movimiento_cpu();
						esGanador();
					}
				}
			}
		};
		casilla_21.addActionListener(cas_21);
		
		ActionListener cas_22 = new ActionListener() {
			public void actionPerformed(ActionEvent cas_22) {
				// Si se clica una casilla realizamos la correspondiente accion
				marcar(casilla_22);
				// Comprobamos si se ha ganado
				esGanador();
				// Si se ha ganado, jugando sera false y no seguiremos
				if(jugando==true) {
					// Mientras no se gane y el turno sea de la cpu realizamos el movimiento y comprobamos si se ha ganado
					if((cpu_1.isSelected() && turno==1) || (cpu_2.isSelected() && turno==2)) {
						movimiento_cpu();
						esGanador();
					}
				}
			}
		};
		casilla_22.addActionListener(cas_22);
		
		/*
		 * Aqui acaba el constructor
		 */
	}
	
	private void esGanador() {
		
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
			jugando=false;
		}
	}
	
	private boolean hayTres() {
		
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
	
	private void clearTablero() {
		
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
	
	private void marcar(JButton boton) {
		
		/*
		 *  Metodo para realizar un turno de usuario, es decir, este metodo se activa cuando se clica en cualquier casilla y obtiene por parametro
		 *  esa casilla, luego la marca con una X o O dependiendo del turno en que estemos.
		 */

		if(jugando==true) { // Solo realizamos las operaciones si estamos en medio de una partida
			// Cogemos el nombre de la casilla para poder saber donde marcar las X o las O
			int fila = Integer.parseInt(Character.toString(boton.getName().charAt(0)));
			int colum = Integer.parseInt(Character.toString(boton.getName().charAt(1)));
			// Estos parse no daran error porque el nombre de las casillas las hemos puesto nosotros y sabemos que son enteros ente 0 y 2
			if(turno==1) {
				// Si estamos en el turno 1 marcaremos con X
				if(hayTres()) { // Si ya hay 3 fichas primero desmarcamos una
					if(tablero[fila][colum]==1) {
						// Si la casilla seleccionada tiene una X, la vaciamos y en la matriz ponemos un 0
						tablero[fila][colum]=0;
						boton.setText("");
						// Despues esperariamos que se clique otra casilla para marcarla
					}else {
						// Si por el contrario intentamos desmarcar una casilla que esta vacia o tiene un O, mostramos un mensaje avisando
						JOptionPane.showMessageDialog(null, "Esa casilla no tiene una X");
						// Despues del mensaje esperariamos a que se clicara una casilla correcta
					}
				}else {
					// Si no hay tres comprobamos que la casilla seleccionada este vacia
					if(tablero[fila][colum]==0) {
						// Si es el caso cambiamos el turno, porque el jugador ya ha hecho un movimiento valido
						turno=2;
						// Setemaos la matriz a 1 y la casilla a X
						tablero[fila][colum]=1;
						boton.setText("X");
						// Mostramos el mensaje de que se ha cambiado el turno
						if(textField_jug2.getText().equals("")) {
							comentario.setText("Turno del "+et_jug2);
						}else {
							comentario.setText("Turno de "+textField_jug2.getText());
						}
					}else {
						// Si no se clica una casilla vacia mostramos el mensaje y esperamos que clique otra
						JOptionPane.showMessageDialog(null, "Esa casilla ya esta ocupada");
					}
				}
			}else {
				// Si es el turno del jugador 2 realizamos exactamente las mismas operaciones pero para las O de las casillas y los 2 en la matriz
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
							comentario.setText("Turno del "+et_jug1);
						}else {
							comentario.setText("Turno de "+textField_jug1.getText());
						}
					}else {
						JOptionPane.showMessageDialog(null, "Esa casilla ya esta ocupada");
					}
				}
			}
		}
	}
	
	private void movimiento_cpu() {
		
		/*
		 *  Metodo para realizar un movimiento de CPU, completamente aleatorio
		 */
		
		Random rndt = new Random(); // Usamos una instancia de Random
		// Creamos variables para asignar las coordenadas
		int fila;
		int colum;
		// Llamamos a todos los botones del tablero
		Component[] componentes = panel_tablero.getComponents();
		// Si ya hay tres fichas desmarcamos una tambien de forma aleatoria
		if(hayTres()) {
			do {
				// Numero random entre 0 y 2 para fila y columna
				fila = (int)(rndt.nextDouble()*3);
				colum = (int)(rndt.nextDouble()*3);
			}while(tablero[fila][colum]!=turno); 
			// Repetimos la generacion hasta que tengamos una casilla con la ficha correspondiente al turno, si es el turno del jugador 1
			// hasta que tengamos una casilla con X y si es el turno del jugador 2, hasta que tengamos un O
			tablero[fila][colum]=0; // Cuando la tengamos la seteamos a vacia
			for(int i=0;i<componentes.length;i++) {
				// Recorremos la lista de botones de casilla para entrar la que tenga como nombre las coordenadas generadas
				if(componentes[i].getName().equals(""+fila+""+colum)) {
					// Una vez encontrada la vaciamos y hacemos un break para salir del for
					JButton bot = (JButton)componentes[i];
					bot.setText("");
					break;
				}
			}
		}
		// Una vez desmarcada la casilla o bien porque todavia no habiamos llegado a 3 fichas en el tablero, procedemos a marcar una casilla aleatoria
		do{
			// Otra vez una fila y columna random entre 0 y 2
			fila=(int)(rndt.nextDouble()*3);
			colum=(int)(rndt.nextDouble()*3);
		}while(tablero[fila][colum]!=0); // Ahora repetimos hasta encontrar una casilla vacia
		// Seteamos a 1 o a 2 dependiendo del turno
		tablero[fila][colum]=turno;
		// Recorremos la lista de botones
		for(int i=0;i<componentes.length;i++) {
			// Queremos encontrar el boton con las coordenadas generadas
			if(componentes[i].getName().equals(""+fila+""+colum)) {
				JButton bot = (JButton)componentes[i];
				// Una vez encontrado, marcamos con el correspondiente simbolo, mostramos los comentarios y cambiamos el turno
				if(turno==1) {
					bot.setText("X");
					if(textField_jug2.getText().equals("")) {
						comentario.setText("Turno del Jugador 2...");
					}else {
						comentario.setText("Turno de "+textField_jug2.getText());
					}
					turno=2;
				}else {
					bot.setText("O");
					if(textField_jug1.getText().equals("")) {
						comentario.setText("Turno del Jugador 1...");
					}else {
						comentario.setText("Turno de "+textField_jug1.getText());
					}
					turno=1;
				}
				// Salimos del for para no seguir buscando si ya hemos encontrado la casilla
				break;
			}
		}
	}
}
