package co.edu.unbosque.view;
/**
* Clase VentanaTutorial
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
public class VentanaTutorial extends JFrame {
	/**
	 * Objeto de PanelTutorial que permite llamar sus métodos y atributos
	 */
	private PanelTutorial ptuto;
	/**
	 * Método Contructor de la clase VentanaTutorial
	 */
	public VentanaTutorial() {
		setTitle("Tutorial");
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
	 * Método que inicializa los componentes de los objetos.
	 */
	private void inicializarComponentes() {
		ptuto = new PanelTutorial();
		ptuto.setBounds(10,10,765,540);
		getContentPane().add(ptuto);
	}

	public PanelTutorial getPtuto() {
		return ptuto;
	}

	public void setPtuto(PanelTutorial ptuto) {
		this.ptuto = ptuto;
	}
	
}
