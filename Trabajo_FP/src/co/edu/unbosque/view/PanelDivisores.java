package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelDivisores extends JPanel{
	
	private JLabel etiqueta_divisores;
	private JTextField campo_numero2;
	private JButton boton_divisores;
	
	public PanelDivisores() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.white);
		setBorder(new TitledBorder("Contador de Divisores"));
		
		etiqueta_divisores = new JLabel("Ingrese numero:");
		etiqueta_divisores.setBounds(20, 40, 120, 20);
		add(etiqueta_divisores);
		
		campo_numero2 = new JTextField();
		campo_numero2.setBounds(120, 40, 210, 20);
		add(campo_numero2);
		
		boton_divisores = new JButton("Generar Divisores");
		boton_divisores.setBackground(Color.lightGray);
		boton_divisores.setBounds(90, 100, 160, 40);
		boton_divisores.setActionCommand("GENERAR DIVISORES");
		add(boton_divisores);
		
	}

	public JLabel getEtiqueta_divisores() {
		return etiqueta_divisores;
	}

	public void setEtiqueta_divisores(JLabel etiqueta_divisores) {
		this.etiqueta_divisores = etiqueta_divisores;
	}

	public JTextField getCampo_numero2() {
		return campo_numero2;
	}

	public void setCampo_numero2(JTextField campo_numero2) {
		this.campo_numero2 = campo_numero2;
	}

	public JButton getBoton_divisores() {
		return boton_divisores;
	}

	public void setBoton_divisores(JButton boton_divisores) {
		this.boton_divisores = boton_divisores;
	}

}
