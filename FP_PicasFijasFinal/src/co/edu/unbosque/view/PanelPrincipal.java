package co.edu.unbosque.view;
/**
* Clase PanelPrincipal
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
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class PanelPrincipal extends JPanel{
	
	/**
	 *  Objeto de JLabel
	 */
	private JLabel e_titulo;
	/**
	 * Objeto de JButton
	 */
	private JButton b_tuto, b_1vs1, b_1vsM;
	/**
	 * Método Contructor de la clase PanelPrincipal
	 */
	public PanelPrincipal() {
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
		
		e_titulo = new JLabel("PICAS Y FIJAS");
		e_titulo.setForeground(Color.BLACK);
		e_titulo.setFont(new Font("Algerian", 20, 40));
		e_titulo.setBounds(95, 100, 264, 45);
		add(e_titulo);
		
		b_tuto = new JButton("Tutorial");
		b_tuto.setActionCommand("TUTORIAL");
		b_tuto.setBounds(180, 170, 100, 30);
		add(b_tuto);
		
		b_1vsM= new JButton("Jugador VS Máquina");
		b_1vsM.setActionCommand("JvsM");
		b_1vsM.setBounds(70, 220, 155, 30);
		add(b_1vsM);
		
		b_1vs1= new JButton("Jugador VS Jugador");
		b_1vs1.setActionCommand("JvsJ");
		b_1vs1.setBounds(235, 220, 155, 30);
		add(b_1vs1);
	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JButton getB_tuto() {
		return b_tuto;
	}

	public void setB_tuto(JButton b_tuto) {
		this.b_tuto = b_tuto;
	}

	public JButton getB_1vs1() {
		return b_1vs1;
	}

	public void setB_1vs1(JButton b_1vs1) {
		this.b_1vs1 = b_1vs1;
	}

	public JButton getB_1vsM() {
		return b_1vsM;
	}

	public void setB_1vsM(JButton b_1vsM) {
		this.b_1vsM = b_1vsM;
	}
	
}
