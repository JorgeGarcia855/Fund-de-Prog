package co.edu.unbosque.view;

/**
 * Clase PanelJugador
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
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class PanelJugador extends JPanel{

	/**
	 * Objeto de JLabel
	 */
	private JLabel e_jug, e_num1, e_numA, e_picas, e_fijas, e_intentos, e_puntos;
	/**
	 * Objeto de JPasswordField
	 */
	private JPasswordField c_num1;
	/**
	 * Objeto de JTextField
	 */
	private JTextField c_numA, c_picas, c_fijas;
	/**
	 * Objeto de JTextAres
	 */
	private JTextArea c_lista;
	/**
	 * Objeto de JButton
	 */
	private JButton b_ingresar, b_adivinar, b_ayuda1, b_ayuda2, b_ayuda3;
	/**
	 * Objeto de JScrollPane
	 */
	private JScrollPane lista;
	/**
	 * Objeto de tipo int
	 */
	private int numintentos;
	/**
	 * Objeto de tipo int
	 */
	private int puntuacion;
	
	/**
	 * Método Contructor de la clase PanelJugador 
	 */
	public PanelJugador() {
		setLayout(null);
		inicializarComponentes();
	}
	/**
	 * Método que inicializa los componentes de los objetos.
	 * 
	 */
	public void inicializarComponentes() {
		setBorder(new LineBorder(Color.darkGray));
		
		e_jug = new JLabel("Jugador 1");
		e_jug.setBounds(140, 10, 100, 20);
		e_jug.setFont(new Font(getName(), Font.BOLD, 14));
		add(e_jug);
		
		e_num1 = new JLabel("Ingrese número J1:");
		e_num1.setBounds(10, 50, 150, 20);
		e_num1.setFont(new Font(getName(), Font.BOLD, 12));
		add(e_num1);
		
		c_num1 = new JPasswordField();
		c_num1.setBounds(130,50,100,20);
		add(c_num1);
		
		b_ingresar = new JButton("Ingresar");
		b_ingresar.setActionCommand("INGRESARNUM");
		b_ingresar.setBounds(240, 50, 100, 20);
		add(b_ingresar);
		
		e_numA = new JLabel("Ingrese número:");
		e_numA.setBounds(10, 80, 150, 20);
		e_numA.setFont(new Font(getName(), Font.BOLD, 12));
		add(e_numA);
		
		c_numA = new JTextField();
		c_numA.setBounds(130,80,100,20);
		add(c_numA);
		
		b_adivinar = new JButton("Adivinar");
		b_adivinar.setActionCommand("ADIVINAR");
		b_adivinar.setBounds(240, 80, 100, 20);
		add(b_adivinar);
		
		c_lista = new JTextArea("||  Número  ||  Fijas  ||  Picas ||\n");
		c_lista.setBounds(10, 120, 190, 250);
		c_lista.setBorder(new LineBorder(null));
		c_lista.setEditable(false);
		add(c_lista);
		
		lista = new JScrollPane(c_lista);
		lista.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		lista.setBounds(10, 120, 190, 250);
		add(lista);
		
		e_picas = new JLabel("Picas");
		e_picas.setBounds(210, 120, 100, 20);
		add(e_picas);
		
		c_picas = new JTextField();
		c_picas.setEnabled(false);
		c_picas.setBounds(210, 150, 100, 20);
		add(c_picas);
		
		e_fijas = new JLabel("Fijas");
		e_fijas.setBounds(210, 180, 100, 20);
		add(e_fijas);
		
		c_fijas = new JTextField();
		c_fijas.setEnabled(false);
		c_fijas.setBounds(210, 210, 100, 20);
		add(c_fijas);
		
		e_puntos = new JLabel("Puntuación: "+puntuacion);
		e_puntos.setFont(new Font(getName(), Font.BOLD, 15));
		e_puntos.setBounds(210, 240, 200, 40);
		add(e_puntos);

		e_intentos = new JLabel("Intentos: "+numintentos);
		e_intentos.setFont(new Font(getName(), Font.BOLD, 15));
		e_intentos.setBounds(10, 380, 200, 40);
		e_intentos.setBounds(210, 270, 200, 40);
		add(e_intentos);
		
		b_ayuda1 = new JButton("Ver picas (5 pts)");
		b_ayuda1.setActionCommand("AYUDA1");
		b_ayuda1.setBounds(10, 380, 140, 20);
		add(b_ayuda1);
		
		b_ayuda2 = new JButton("Ver fijas (10 pts)");
		b_ayuda2.setActionCommand("AYUDA2");
		b_ayuda2.setBounds(10, 405, 140, 20);
		add(b_ayuda2);
		
		b_ayuda3 = new JButton("Descubrir un número en una posición (20 pts)");
		b_ayuda3.setActionCommand("AYUDA3");
		b_ayuda3.setBounds(10, 430, 300, 20);
		add(b_ayuda3);
	}
	
	public JButton getB_ayuda1() {
		return b_ayuda1;
	}

	public void setB_ayuda1(JButton b_ayuda1) {
		this.b_ayuda1 = b_ayuda1;
	}

	public JButton getB_ayuda2() {
		return b_ayuda2;
	}

	public void setB_ayuda2(JButton b_ayuda2) {
		this.b_ayuda2 = b_ayuda2;
	}

	public JButton getB_ayuda3() {
		return b_ayuda3;
	}

	public void setB_ayuda3(JButton b_ayuda3) {
		this.b_ayuda3 = b_ayuda3;
	}

	public JLabel getE_puntos() {
		return e_puntos;
	}

	public void setE_puntos(JLabel e_puntos) {
		this.e_puntos = e_puntos;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public JLabel getE_intentos() {
		return e_intentos;
	}

	public void setE_intentos(JLabel e_intentos) {
		this.e_intentos = e_intentos;
	}

	public JScrollPane getLista() {
		return lista;
	}

	public void setLista(JScrollPane lista) {
		this.lista = lista;
	}

	public int getNumintentos() {
		return numintentos;
	}

	public void setNumintentos(int numintentos) {
		this.numintentos = numintentos;
	}

	public JLabel getE_jug() {
		return e_jug;
	}

	public void setE_jug(JLabel e_jug) {
		this.e_jug = e_jug;
	}

	public JLabel getE_num1() {
		return e_num1;
	}

	public void setE_num1(JLabel e_num1) {
		this.e_num1 = e_num1;
	}

	public JLabel getE_numA() {
		return e_numA;
	}

	public void setE_numA(JLabel e_numA) {
		this.e_numA = e_numA;
	}

	public JLabel getE_picas() {
		return e_picas;
	}

	public void setE_picas(JLabel e_picas) {
		this.e_picas = e_picas;
	}

	public JLabel getE_fijas() {
		return e_fijas;
	}

	public void setE_fijas(JLabel e_fijas) {
		this.e_fijas = e_fijas;
	}

	public JPasswordField getC_num1() {
		return c_num1;
	}

	public void setC_num1(JPasswordField c_num1) {
		this.c_num1 = c_num1;
	}

	public JTextField getC_numA() {
		return c_numA;
	}

	public void setC_numA(JTextField c_numA) {
		this.c_numA = c_numA;
	}

	public JTextField getC_picas() {
		return c_picas;
	}

	public void setC_picas(JTextField c_picas) {
		this.c_picas = c_picas;
	}

	public JTextField getC_fijas() {
		return c_fijas;
	}

	public void setC_fijas(JTextField c_fijas) {
		this.c_fijas = c_fijas;
	}

	public JTextArea getC_lista() {
		return c_lista;
	}

	public void setC_lista(JTextArea c_lista) {
		this.c_lista = c_lista;
	}

	public JButton getB_ingresar() {
		return b_ingresar;
	}

	public void setB_ingresar(JButton b_ingresar) {
		this.b_ingresar = b_ingresar;
	}

	public JButton getB_adivinar() {
		return b_adivinar;
	}

	public void setB_adivinar(JButton b_adivinar) {
		this.b_adivinar = b_adivinar;
	}
	
	
	
}
