package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelResultados extends JPanel {
	
	private JTextArea area_resultados;
	
	public PanelResultados() {
		setLayout(new GridLayout(1,1));
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.WHITE);
		setBorder(new TitledBorder("Módulo de Resultados:"));
		
		area_resultados = new JTextArea();
		add(area_resultados);
		
	}

	public JTextArea getArea_resultados() {
		return area_resultados;
	}

	public void setArea_resultados(JTextArea area_resultados) {
		this.area_resultados = area_resultados;
	}
}
