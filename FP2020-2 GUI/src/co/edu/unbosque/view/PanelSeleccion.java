package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelSeleccion extends JPanel{

	private JLabel etoperaciones;
	private JComboBox<String> menu_operaciones;
	
	public PanelSeleccion() {
		setLayout(new FlowLayout());
		inicializarComponentes();
		setBackground(Color.BLACK);
	}
	
	public void inicializarComponentes() {
		
		etoperaciones = new JLabel("Operaciones a realizar:");
		etoperaciones.setForeground(Color.WHITE);
		add(etoperaciones);
		
		menu_operaciones = new JComboBox<String>();
		menu_operaciones.addItem("Ej. Fibonacci");
		menu_operaciones.addItem("Ej. Contar Espacios");
		menu_operaciones.addItem("Ej. Conversion Hex-Dec");
		menu_operaciones.setActionCommand("OPERACIONES");
		add(menu_operaciones);
		
	}

	public JLabel getEtoperaciones() {
		return etoperaciones;
	}

	public void setEtoperaciones(JLabel etoperaciones) {
		this.etoperaciones = etoperaciones;
	}

	public JComboBox<String> getMenu_operaciones() {
		return menu_operaciones;
	}

	public void setMenu_operaciones(JComboBox<String> menu_operaciones) {
		this.menu_operaciones = menu_operaciones;
	}
	
}
