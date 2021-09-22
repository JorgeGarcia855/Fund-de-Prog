package co.edu.unbosque.view.windows;

import co.edu.unbosque.view.panels.PanelDecBin;

import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaDecBin extends JFrame{
	
	private PanelDecBin pdb;
	
	public VentanaDecBin() {
		setTitle("Convertidor DecBin");
		setSize(295,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		pdb = new PanelDecBin();
		pdb.setBounds(5, 5,270, 400);
		add(pdb);
	}

	public PanelDecBin getPdb() {
		return pdb;
	}

	public void setPdb(PanelDecBin pdb) {
		this.pdb = pdb;
	}

}
