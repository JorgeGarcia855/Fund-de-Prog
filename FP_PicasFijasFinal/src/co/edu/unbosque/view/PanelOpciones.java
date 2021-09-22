package co.edu.unbosque.view;
/**
* Clase PanelOpciones
* 
* Clase de la vista que cuenta con 2 metodos, el constructor y otro de tipo void.
* 
* @author David Real
* @author David Millán
* @author Jorge García
* @version 1.0
* 
*/

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelOpciones extends JPanel{
	/**
	 * Objeto de JLabel
	 */
	private JLabel e_titulo, e_NDigitos, e_DigRep, e_intentos, e_MinMax;
	/**
	 * Objeto de JTextField
	 */
	private JTextField c_dig, c_intentos;
	/**
	 * Objeto de JRadioButton
	 */
	private JRadioButton o_RepSi;
	/**
	 * Objeto de JButton
	 */
	private JButton b_opciones;
	/**
	 * Método Contructor de la clase PanelOpciones
	 */
	public PanelOpciones() {
		setLayout(null);
		inicializarComponentes();
	}
	/**
	 * Método que inicializa los componentes de los objetos.
	 * 
	 */
	private void inicializarComponentes() {
		
		e_titulo =new JLabel("Opciones del Juego");
		e_titulo.setFont(new Font(getName(), Font.BOLD, 13));
		e_titulo.setBounds(10, 10, 200, 20);
		add(e_titulo);
		
		e_NDigitos = new JLabel("Número de dígitos");
		e_NDigitos.setBounds(70, 50, 200, 20);
		add(e_NDigitos);
		
		c_dig = new JTextField();
		c_dig.setBounds(195,50,100,20);
		add(c_dig);
		
		e_DigRep = new JLabel("Dígitos Repetidos");
		e_DigRep.setBounds(70, 80, 200, 20);
		add(e_DigRep);
		
		o_RepSi = new JRadioButton("SI", false);
		o_RepSi.setBounds(195, 80, 100, 20);
		add(o_RepSi);
		
		e_intentos =new JLabel("Cantidad de Intentos");
		e_intentos.setBounds(70, 110, 200, 20);
		add(e_intentos);
		
		c_intentos = new JTextField();
		c_intentos.setBounds(195,110,100,20);
		add(c_intentos);
		
		e_MinMax = new JLabel("Mín: 1 || Max: Número de dígitos*5");
		e_MinMax.setBounds(85, 130, 200, 20);
		add(e_MinMax);
		
		b_opciones = new JButton("Ingresar");
		b_opciones.setActionCommand("OPCIONES");
		b_opciones.setBounds(70,160,225,20);
		add(b_opciones);
	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JLabel getE_NDigitos() {
		return e_NDigitos;
	}

	public void setE_NDigitos(JLabel e_NDigitos) {
		this.e_NDigitos = e_NDigitos;
	}

	public JLabel getE_DigRep() {
		return e_DigRep;
	}

	public void setE_DigRep(JLabel e_DigRep) {
		this.e_DigRep = e_DigRep;
	}

	public JLabel getE_intentos() {
		return e_intentos;
	}

	public void setE_intentos(JLabel e_intentos) {
		this.e_intentos = e_intentos;
	}

	public JTextField getC_dig() {
		return c_dig;
	}

	public void setC_dig(JTextField c_dig) {
		this.c_dig = c_dig;
	}

	public JTextField getC_intentos() {
		return c_intentos;
	}

	public void setC_intentos(JTextField c_intentos) {
		this.c_intentos = c_intentos;
	}

	public JRadioButton getO_RepSi() {
		return o_RepSi;
	}

	public void setO_RepSi(JRadioButton o_RepSi) {
		this.o_RepSi = o_RepSi;
	}

	public JButton getB_opciones() {
		return b_opciones;
	}

	public void setB_opciones(JButton b_opciones) {
		this.b_opciones = b_opciones;
	}
	
}
