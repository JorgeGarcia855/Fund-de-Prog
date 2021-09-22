package co.edu.unbosque.view;
/**
* Clase VentanaTutorial
* 
* Clase de la vista que cuenta con 2 metodos, el constructor y otro de tipo void.
* 
* @author David Real
* @author David Mill�n
* @author Jorge Garc�a
* @version 1.0
* 
*/
import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaTutorial extends JFrame {
	/**
	 * Objeto de PanelTutorial que permite llamar sus m�todos y atributos
	 */
	private PanelTutorial ptuto;
	/**
	 * M�todo Contructor de la clase VentanaTutorial
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
	 * M�todo que inicializa los componentes de los objetos.
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
