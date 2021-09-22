package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelFibonacci extends JPanel{
	
	private JLabel etiqueta_fibonacci;
	private JTextField campo_numero1;
	private JButton boton_fibonacci;
	
	public PanelFibonacci() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.white);
		setBorder(new TitledBorder("Secuencia de Fibonacci"));
		
		etiqueta_fibonacci = new JLabel("Ingrese numero:");
		etiqueta_fibonacci.setBounds(20, 40, 120, 20);
		add(etiqueta_fibonacci);
		
		campo_numero1 = new JTextField();
		campo_numero1.setBounds(120, 40, 210, 20);
		add(campo_numero1);
		
		boton_fibonacci = new JButton("Generar Secuencia");
		boton_fibonacci.setBackground(Color.lightGray);
		boton_fibonacci.setBounds(90, 100, 160, 40);
		boton_fibonacci.setActionCommand("GENERAR SECUENCIA");
		add(boton_fibonacci);
		
	}

	public JLabel getEtiqueta_fibonacci() {
		return etiqueta_fibonacci;
	}

	public void setEtiqueta_fibonacci(JLabel etiqueta_fibonacci) {
		this.etiqueta_fibonacci = etiqueta_fibonacci;
	}

	public JTextField getCampo_numero1() {
		return campo_numero1;
	}

	public void setCampo_numero1(JTextField campo_numero1) {
		this.campo_numero1 = campo_numero1;
	}

	public JButton getBoton_fibonacci() {
		return boton_fibonacci;
	}

	public void setBoton_fibonacci(JButton boton_fibonacci) {
		this.boton_fibonacci = boton_fibonacci;
	}
	
	

}
