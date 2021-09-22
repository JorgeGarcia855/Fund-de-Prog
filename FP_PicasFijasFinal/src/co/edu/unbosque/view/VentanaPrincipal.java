package co.edu.unbosque.view;
/**
* Clase VentanaPrincipal
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
import javax.swing.JLayeredPane;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame{
	/**
	 * Objeto de PanelPricipal que permite llamar sus métodos y atributos
	 */
	private PanelPrincipal principal;
	/**
	 * Objeto de PanelImagen que permite llamar sus métodos y atributos
	 */
	private PanelImagen pImagen;
	/**
	 * Objeto de JLayeredPane
	 */
	private JLayeredPane lPane;
	
	/**
	 * Método Contructor de la clase VentanaPrincipal
	 */
	public VentanaPrincipal() {
		
		setTitle("Menú Principal");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.darkGray);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	/**
	 * Método que inicializa los componentes de los objetos.
	 * 
	 */

	public void inicializarComponentes() {
		principal = new PanelPrincipal();
		principal.setBounds(5, 5, 475,350);
		principal.setOpaque(false);
		getContentPane().add(principal);
		
		lPane = new JLayeredPane();
		lPane.setBounds(0, 0, 500, 400);
		getContentPane().add(lPane);
		
		pImagen = new PanelImagen();
		pImagen.setBounds(75, 20, 320, 320);
		pImagen.setOpaque(true);
		lPane.add(pImagen, new Integer(0), 0);
	}

	public PanelPrincipal getPrincipal() {
		return principal;
	}

	public void setPrincipal(PanelPrincipal principal) {
		this.principal = principal;
	}

	public PanelImagen getpImagen() {
		return pImagen;
	}

	public void setpImagen(PanelImagen pImagen) {
		this.pImagen = pImagen;
	}

	public JLayeredPane getlPane() {
		return lPane;
	}

	public void setlPane(JLayeredPane lPane) {
		this.lPane = lPane;
	}
	
	
	
}
