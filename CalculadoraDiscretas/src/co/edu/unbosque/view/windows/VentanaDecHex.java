package co.edu.unbosque.view.windows;

import co.edu.unbosque.view.panels.PanelDecHex;

import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaDecHex extends JFrame {
	
	private PanelDecHex pdh;
	
	public VentanaDecHex() {
		setTitle("Convertidor DecHex");
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
		pdh = new PanelDecHex();
		pdh.setBounds(5, 5,270, 400);
		add(pdh);
	}

	public PanelDecHex getPdh() {
		return pdh;
	}

	public void setPdh(PanelDecHex pdh) {
		this.pdh = pdh;
	}

}
