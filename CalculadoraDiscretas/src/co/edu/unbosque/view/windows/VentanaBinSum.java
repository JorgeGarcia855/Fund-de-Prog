package co.edu.unbosque.view.windows;

import co.edu.unbosque.view.panels.PanelBinSum;

import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaBinSum extends JFrame{
	
	private PanelBinSum pbs;
	
	public VentanaBinSum() {
		setTitle("Suma de Binarios");
		setSize(305,475);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		pbs = new PanelBinSum();
		pbs.setBounds(5, 5, 280, 425);
		add(pbs);
	}

	public PanelBinSum getPbs() {
		return pbs;
	}

	public void setPbs(PanelBinSum pbs) {
		this.pbs = pbs;
	}

}
