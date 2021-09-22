package co.edu.unbosque.view;
/**
* Clase PanelTutorial
* 
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
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class PanelTutorial extends JPanel{
	/**
	 * Objeto de JLabel
	 */
	private JLabel e_titulo, e_como, e_pyf, e_ej;
	/**
	 * Objeto de JTextArea
	 */
	private JTextArea c_como, c_pyf, c_ej;
	/**
	 * Objeto de JButton
	 */
	private JButton b_PvsM, b_menu;

	/**
	 * Método Contructor de la clase PanelTutorial
	 */
	public PanelTutorial(){
		setLayout(null);
		inicializarComponentes();
	}
	/**
	 * Método que inicializa los componentes de los objetos.
	 * 
	 */
	private void inicializarComponentes() {
		
		setBackground(new Color(222,222,222));
		setBorder(new LineBorder(new Color(190, 255, 237 )));
		
		b_menu = new JButton("Volver");
		b_menu.setBounds(5, 10, 100, 20);
		b_menu.setActionCommand("VOLVER");
		add(b_menu);
		
		e_titulo = new JLabel("TUTORIAL");
		e_titulo.setFont(new Font("Algerian", 20, 40));
		e_titulo.setBounds(280, 30, 264, 45);
		add(e_titulo);
		
		e_como = new JLabel("¿Cómo se juega?");
		e_como.getFont();
		e_como.setFont(new Font(getName(), Font.BOLD, 14));
		e_como.setBounds(50, 90, 130, 20);
		add(e_como);
		
		c_como = new JTextArea("Cada jugador debe pensar en dos números de máximo 10 digitos y mínimo 1 digito, el número pensado debe ser secreto, para que el oponente lo adivine en un determinado número de intentos. Si se acaban los intentos el ganador es el que tenga mayor número de puntos");
		c_como.setBackground(new Color(222,222,222));
		c_como.setFont(new Font(getName(), 12, 14));
		c_como.setLineWrap(true);
		c_como.setWrapStyleWord(true);
		c_como.setBounds(50, 120, 300, 135);
		c_como.setEditable(false);
		add(c_como);
		

		e_pyf = new JLabel("Picas y Fijas");
		e_pyf.getFont();
		e_pyf.setFont(new Font(getName(), Font.BOLD, 14));
		e_pyf.setBounds(50, 260, 130, 20);
		add(e_pyf);
		
		c_pyf = new JTextArea("Las picas consisten en que cuando se adivine uno de los digitos del número "
				+ "del oponente y este no coincida con la posición se le denominará pica y cada una valdrá 2 puntos.\n" 
				+ "\nSe tiene una fija cuando se adivina el número del oponente y además el número coincide en la misma posición. Cada Fija valdrá 5 puntos");
		c_pyf.setBackground(new Color(222,222,222));
		c_pyf.setFont(new Font(getName(), 12, 14));
		c_pyf.setLineWrap(true);
		c_pyf.setWrapStyleWord(true);
		c_pyf.setBounds(50, 290, 300, 200);
		c_pyf.setEditable(false);
		add(c_pyf);
		
		e_ej = new JLabel("Ejemplo");
		e_ej.getFont();
		e_ej.setFont(new Font(getName(), Font.BOLD, 14));
		e_ej.setBounds(420, 90, 130, 20);
		add(e_ej);
		
		c_ej = new JTextArea("Número secreto: 123456\r\n"  
					+"Intento del oponente: 135890\r\n\n" 
					+"Picas: 2\r\n" 
					+"Se tienen 2 picas 3 y 5, puesto que en el\r\n"  
					+"en el intento se menciona el 3 y el 5 pero estos no coinciden con la posicion del numero original.\r\n"  
					+"\r\n" 
					+"Fijas: 1 \r\n"  
					+"Se tiene 1 fija que sería el numero 1 ya que este se encuentra en la primera posición en ambos numeros.");
		c_ej.setBackground(new Color(222,222,222));
		c_ej.setFont(new Font(getName(), 12, 14));
		c_ej.setLineWrap(true);
		c_ej.setWrapStyleWord(true);
		c_ej.setBounds(420, 120, 300, 300);
		c_ej.setEditable(false);
		add(c_ej);
		
		b_PvsM =new JButton("Jugador VS Máquina");
		b_PvsM.setActionCommand("JvsM");
		b_PvsM.setBounds(290, 460, 155, 30);
		add(b_PvsM);
	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JLabel getE_como() {
		return e_como;
	}

	public void setE_como(JLabel e_como) {
		this.e_como = e_como;
	}

	public JLabel getE_pyf() {
		return e_pyf;
	}

	public void setE_pyf(JLabel e_pyf) {
		this.e_pyf = e_pyf;
	}

	public JLabel getE_ej() {
		return e_ej;
	}

	public void setE_ej(JLabel e_ej) {
		this.e_ej = e_ej;
	}

	public JTextArea getC_como() {
		return c_como;
	}

	public void setC_como(JTextArea c_como) {
		this.c_como = c_como;
	}

	public JTextArea getC_pyf() {
		return c_pyf;
	}

	public void setC_pyf(JTextArea c_pyf) {
		this.c_pyf = c_pyf;
	}

	public JTextArea getC_ej() {
		return c_ej;
	}

	public void setC_ej(JTextArea c_ej) {
		this.c_ej = c_ej;
	}

	public JButton getB_PvsM() {
		return b_PvsM;
	}

	public void setB_PvsM(JButton b_PvsM) {
		this.b_PvsM = b_PvsM;
	}

	public JButton getB_menu() {
		return b_menu;
	}

	public void setB_menu(JButton b_menu) {
		this.b_menu = b_menu;
	}
	
}
