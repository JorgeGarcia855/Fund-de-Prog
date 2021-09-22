package co.edu.unbosque.view;

/**
* Clase PanelJuego
* 
* Clase de la vista que cuenta con 2 metodos, el constructor y otro de tipo void.
* 
* @author David Real
* @author David Millán
* @author Jorge García
* @version 1.0
* 
*/

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class PanelJuego extends JPanel{
	/**
	 * Objeto de JButton
	 */
	private JButton b_menu;
	/**
	 * Objeto de PanelJugador que permite llamar a sus métodos y atributos
	 */
	private PanelJugador pJugador;
	/**
	 * Objeto de PanelJugador que permite llamar a sus métodos y atributos
	 */
	private PanelJugador pJugador2;
	/**
	 * Método Contructor de la clase PanelJuego
	 */
	public PanelJuego() {
		setLayout(null);
		inicializarComponentes();
	}
	/**
	 * Método que inicializa los componentes de los objetos.
	 * 
	 */
	public void inicializarComponentes() {
		setBackground(new Color(222,222,222));
		setBorder(new LineBorder(new Color(190, 255, 237 )));
		
		b_menu = new JButton("Volver");
		b_menu.setBounds(5, 10, 100, 20);
		b_menu.setActionCommand("VOLVER");
		add(b_menu);
		
		pJugador = new PanelJugador();
		pJugador.setBounds(15, 50, 370, 490);
		pJugador.getB_ingresar().setActionCommand("INGRESARNUM1");
		pJugador.getB_adivinar().setActionCommand("ADIVNUM1");
		add(pJugador);
		
		pJugador2 =new PanelJugador();
		pJugador2.setBounds(390, 50, 370, 490);
		pJugador2.getE_jug().setText("Jugador 2");
		pJugador2.getB_ingresar().setActionCommand("INGRESARNUM2");
		pJugador2.getB_adivinar().setActionCommand("ADIVNUM2");
		pJugador2.getE_num1().setText("Ingrese número J2: ");
		add(pJugador2);
	}
	

	public PanelJugador getpJugador() {
		return pJugador;
	}

	public void setpJugador(PanelJugador pJugador) {
		this.pJugador = pJugador;
	}

	public PanelJugador getpJugador2() {
		return pJugador2;
	}

	public void setpJugador2(PanelJugador pJugador2) {
		this.pJugador2 = pJugador2;
	}

	public JButton getB_menu() {
		return b_menu;
	}

	public void setB_menu(JButton b_menu) {
		this.b_menu = b_menu;
	}
	
}
