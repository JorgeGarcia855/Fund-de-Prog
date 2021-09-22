package co.edu.unbosque.view.panels;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelMenu extends JPanel{
	
	private JButton bDecBin, bDecHex, bSumBin, bSalir;
	
	
	public PanelMenu() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		setBackground(Color.lightGray);
		setBorder(new TitledBorder("Seleccione la operaci�n"));
		
		bDecBin = new JButton("Decimal a Binario");
		bDecBin.setBounds(50, 50, 175, 25);
		bDecBin.setActionCommand("CONVERTIR_DECBIN");
		add(bDecBin);
		
		bDecHex = new JButton("Decimal a Hexadecimal");
		bDecHex.setBounds(250, 50, 175, 25);
		bDecHex.setActionCommand("CONVERTIR_DECHEX");
		add(bDecHex);
		
		bSumBin = new JButton("Suma de Binarios");
		bSumBin.setBounds(50, 150, 175, 25);
		bSumBin.setActionCommand("SUMA_BINARIOS");
		add(bSumBin);
		
		bSalir = new JButton("Salir");
		bSalir.setBounds(250, 150, 175, 25);
		bSalir.setActionCommand("SALIR");
		add(bSalir);
	}

	public JButton getbDecBin() {
		return bDecBin;
	}

	public void setbDecBin(JButton bDecBin) {
		this.bDecBin = bDecBin;
	}

	public JButton getbDecHex() {
		return bDecHex;
	}

	public void setbDecHex(JButton bDecHex) {
		this.bDecHex = bDecHex;
	}

	public JButton getbSumBin() {
		return bSumBin;
	}

	public void setbSumBin(JButton bSumBin) {
		this.bSumBin = bSumBin;
	}

	public JButton getbSalir() {
		return bSalir;
	}

	public void setbSalir(JButton bSalir) {
		this.bSalir = bSalir;
	}

}
