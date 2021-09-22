package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelDatosBlanco extends JPanel {
	
		
	public PanelDatosBlanco() {
		setLayout(new GridLayout(1,1));
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.MAGENTA);
		setPreferredSize(new Dimension(300, 330));
		setBorder(new TitledBorder("Módulo de Ingreso:"));

		
	}
}
