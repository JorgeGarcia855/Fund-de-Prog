package co.edu.unbosque.view;

/**
* Clase VentanaJuego
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

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaJuego extends JFrame{
	/**
	 * Objeto de PanelJuego que permite llamar a sus métodos y atributos
	 */
	private PanelJuego pJuego;
	/**
	 * Método Contructor de la clase VentanaJuego
	 */
	public VentanaJuego() {
		setTitle("Picas Y Fijas");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	/**
	 * Método que inicializa los componentes de el objeto.
	 * 
	 */
	public void inicializarComponentes() {
		pJuego = new PanelJuego();
		pJuego.setBounds(5, 5, 775,550);
		getContentPane().add(pJuego);
	}

	public PanelJuego getpJuego() {
		return pJuego;
	}

	public void setpJuego(PanelJuego pJuego) {
		this.pJuego = pJuego;
	}

	
	
}