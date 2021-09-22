package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame {
	
	private PanelDeDatos pdatos;
	private PanelDeResultados presul;
	
	public VentanaPrincipal() {
		
		setTitle("Primera Calculadora");
		setSize(615, 510);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void inicializarComponentes() {
		
		pdatos = new PanelDeDatos();
		pdatos.setBounds(25, 25, 550, 250);
		getContentPane().add(pdatos);
		
		presul = new PanelDeResultados();
		presul.setBounds(25, 300, 550, 150);
		getContentPane().add(presul);
		
	}

	public PanelDeDatos getPdatos() {
		return pdatos;
	}

	public void setPdatos(PanelDeDatos pdatos) {
		this.pdatos = pdatos;
	}

	public PanelDeResultados getPresul() {
		return presul;
	}

	public void setPresul(PanelDeResultados presul) {
		this.presul = presul;
	}
	
}
