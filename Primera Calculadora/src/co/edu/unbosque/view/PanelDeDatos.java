package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelDeDatos extends JPanel{
	
	private JLabel etiqueta_numero1;
	private JLabel etiqueta_numero2;
	private JLabel etiqueta_operaciones;
	
	private JTextField campo_numero1;
	private JTextField campo_numero2;
	
	private JButton boton_suma;
	private JButton boton_resta;
	private JButton boton_multi;
	private JButton boton_dividir;
	
	public PanelDeDatos() {
		
		setLayout(null);
		
		inicializarComponentes();
		
		setVisible(true);
		
	}
	
	public void inicializarComponentes() {
		
		setBackground(new Color(211,146,146));
		setBorder(new TitledBorder("Panel de Datos"));
		
		
		etiqueta_numero1 = new JLabel("Ingrese Número:");
		etiqueta_numero1.setBounds(50, 50, 120, 20);
		add(etiqueta_numero1);
		
		campo_numero1 = new JTextField();
		campo_numero1.setBounds(190, 50, 210, 20);
		add(campo_numero1);
		
		etiqueta_numero2 = new JLabel("Ingrese Número:");
		etiqueta_numero2.setBounds(50, 100, 120, 20);
		add(etiqueta_numero2);
		
		campo_numero2 = new JTextField();
		campo_numero2.setBounds(190, 100, 210, 20);
		add(campo_numero2);
		
		etiqueta_operaciones = new JLabel("Operaciones:");
		etiqueta_operaciones.setBounds(50, 150, 80, 20);
		add(etiqueta_operaciones);
		
		boton_suma = new JButton("Sumar");
		boton_suma.setBackground(Color.red);
		boton_suma.setBounds(190, 150, 100, 20);
		boton_suma.setActionCommand("SUMAR");
		add(boton_suma);
		
		boton_resta = new JButton("Restar"); 
		boton_resta.setBackground(Color.red);
		boton_resta.setBounds(300, 150, 100, 20);
		boton_resta.setActionCommand("RESTAR");
		add(boton_resta);
		
		boton_multi = new JButton("Multiplicar");
		boton_multi.setBackground(Color.red);
		boton_multi.setBounds(190, 180, 100, 20);
		boton_multi.setActionCommand("MULTIPLICAR");
		add(boton_multi);
		
		boton_dividir = new JButton("Dividir"); 
		boton_dividir.setBackground(Color.red);
		boton_dividir.setBounds(300, 180, 100, 20);
		boton_dividir.setActionCommand("DIVIDIR");
		add(boton_dividir);
		
	}

	public JLabel getEtiqueta_numero1() {
		return etiqueta_numero1;
	}

	public void setEtiqueta_numero1(JLabel etiqueta_numero1) {
		this.etiqueta_numero1 = etiqueta_numero1;
	}

	public JLabel getEtiqueta_numero2() {
		return etiqueta_numero2;
	}

	public void setEtiqueta_numero2(JLabel etiqueta_numero2) {
		this.etiqueta_numero2 = etiqueta_numero2;
	}

	public JLabel getEtiqueta_operaciones() {
		return etiqueta_operaciones;
	}

	public void setEtiqueta_operaciones(JLabel etiqueta_operaciones) {
		this.etiqueta_operaciones = etiqueta_operaciones;
	}

	public JTextField getCampo_numero1() {
		return campo_numero1;
	}

	public void setCampo_numero1(JTextField campo_numero1) {
		this.campo_numero1 = campo_numero1;
	}

	public JTextField getCampo_numero2() {
		return campo_numero2;
	}

	public void setCampo_numero2(JTextField campo_numero2) {
		this.campo_numero2 = campo_numero2;
	}

	public JButton getBoton_suma() {
		return boton_suma;
	}

	public void setBoton_suma(JButton boton_suma) {
		this.boton_suma = boton_suma;
	}

	public JButton getBoton_resta() {
		return boton_resta;
	}

	public void setBoton_resta(JButton boton_resta) {
		this.boton_resta = boton_resta;
	}

	public JButton getBoton_multi() {
		return boton_multi;
	}

	public void setBoton_multi(JButton boton_multi) {
		this.boton_multi = boton_multi;
	}

	public JButton getBoton_dividir() {
		return boton_dividir;
	}

	public void setBoton_dividir(JButton boton_dividir) {
		this.boton_dividir = boton_dividir;
	}

}
