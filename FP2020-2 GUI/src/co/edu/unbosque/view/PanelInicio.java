package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelInicio extends JPanel{
	
	private JButton btingresar;
	
	
	public PanelInicio() {
		setLayout(new GridLayout(1,1,5,5));
		inicializarComponentes();		
	}
	
	public void inicializarComponentes() {
		btingresar = new JButton("Ingresar");
		btingresar.setActionCommand("INGRESAR");
		add(btingresar);
	}

	public JButton getBtingresar() {
		return btingresar;
	}

	public void setBtingresar(JButton btingresar) {
		this.btingresar = btingresar;
	}
	
}
