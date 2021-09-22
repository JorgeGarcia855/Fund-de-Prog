package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelTexto extends JPanel{
	
	private JLabel etiqueta_texto;
	private JTextArea campo_numero3;
	private JButton boton_texto;
	
	public PanelTexto() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.white);
		setBorder(new TitledBorder("Contador de Espacios"));
		
		etiqueta_texto = new JLabel("Escriba el texto:");
		etiqueta_texto.setBounds(20, 40, 120, 20);
		add(etiqueta_texto);
		
		campo_numero3 = new JTextArea();
		campo_numero3.setBounds(20, 80, 385, 150);
		campo_numero3.setLineWrap(true);
		Border margen = BorderFactory.createLineBorder(Color.black);
		campo_numero3.setBorder(margen);
		add(campo_numero3);
		
		boton_texto = new JButton("Contar Espacios");
		boton_texto.setBackground(Color.lightGray);
		boton_texto.setBounds(130, 240, 160, 40);
		boton_texto.setActionCommand("CONTAR ESPACIOS");
		add(boton_texto);
		
	}

	public JLabel getEtiqueta_texto() {
		return etiqueta_texto;
	}

	public void setEtiqueta_texto(JLabel etiqueta_texto) {
		this.etiqueta_texto = etiqueta_texto;
	}

	public JTextArea getCampo_numero3() {
		return campo_numero3;
	}

	public void setCampo_numero3(JTextArea campo_numero3) {
		this.campo_numero3 = campo_numero3;
	}

	public JButton getBoton_texto() {
		return boton_texto;
	}

	public void setBoton_texto(JButton boton_texto) {
		this.boton_texto = boton_texto;
	}

}
