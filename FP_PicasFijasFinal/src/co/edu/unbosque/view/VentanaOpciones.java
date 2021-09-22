package co.edu.unbosque.view;
/**
* Clase VentanaOpciones
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
public class VentanaOpciones extends JFrame{
	/**
	 * Objeto de PanelOpciones que permite llamar sus métodos y atributos 
	 */
	private PanelOpciones pOpciones;
	/**
	 * Método Contructor de la clase VentanaOpciones
	 */
	public VentanaOpciones() {
		setTitle("Picas Y Fijas");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	/**
	 * Método que inicializa los componentes de los objetos.
	 * 
	 */
	private void inicializarComponentes() {
		pOpciones = new PanelOpciones();
		pOpciones.setBounds(5,5,375,250);
		getContentPane().add(pOpciones);
	}

	public PanelOpciones getpOpciones() {
		return pOpciones;
	}

	public void setpOpciones(PanelOpciones pOpciones) {
		this.pOpciones = pOpciones;
	}
	
}
