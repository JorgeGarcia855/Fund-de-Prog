package co.edu.unbosque.view.windows;

import co.edu.unbosque.view.panels.PanelImagen;
import co.edu.unbosque.view.panels.PanelMenu;

import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame{
	
	private PanelMenu pmenu;
	private PanelImagen pim;
	
	public VentanaPrincipal() {
		setTitle("Calculadora y Convertidor");
		setSize(500,365);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		pmenu = new PanelMenu();
		pmenu.setBounds(5, 120, 475, 200);
		add(pmenu);
		
		pim = new PanelImagen();
		pim.setBounds(15, 10, 450, 100);
		pim.setOpaque(true);
		add(pim);
	}

	public PanelMenu getPmenu() {
		return pmenu;
	}

	public void setPmenu(PanelMenu pmenu) {
		this.pmenu = pmenu;
	}

	public PanelImagen getPim() {
		return pim;
	}

	public void setPim(PanelImagen pim) {
		this.pim = pim;
	}
	
}
