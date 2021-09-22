package co.edu.unbosque.view.panels;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class PanelDecHex extends JPanel{
	
	private JLabel ingresarDecDH, resulConvDH;
	private JTextField campoDecDH;
	private JTextArea campoResulHex;
	private JButton bConvertirDH, bVolverDH;
	
	public PanelDecHex() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		setBackground(Color.lightGray);
		
		ingresarDecDH = new JLabel("Ingrese numero a convertir:");
		ingresarDecDH.setBounds(10, 20, 175, 15);
		add(ingresarDecDH);
		
		campoDecDH = new JTextField();
		campoDecDH.setBounds(10, 40, 250, 20);
		add(campoDecDH);
		
		bConvertirDH = new JButton("Convertir");
		bConvertirDH.setBounds(10, 70, 250, 20);
		bConvertirDH.setActionCommand("CONVERTIR_DH");
		add(bConvertirDH);
		
		resulConvDH = new JLabel("El resultado hexadecimal es:");
		resulConvDH.setBounds(10, 100, 200, 15);
		add(resulConvDH);
		
		campoResulHex = new JTextArea();
		campoResulHex.setBounds(10, 120, 250, 250);
		campoResulHex.setLineWrap(true);
		Border margen = BorderFactory.createLineBorder(Color.black);
		campoResulHex.setBorder(margen);
		campoResulHex.setEditable(false);
		add(campoResulHex);
		
		bVolverDH = new JButton("Volver");
		bVolverDH.setBounds(10, 375, 100, 20);
		bVolverDH.setActionCommand("VOLVER_DH");
		add(bVolverDH);
		
	}

	public JLabel getIngresarDecDH() {
		return ingresarDecDH;
	}

	public void setIngresarDecDH(JLabel ingresarDecDH) {
		this.ingresarDecDH = ingresarDecDH;
	}

	public JLabel getResulConvDH() {
		return resulConvDH;
	}

	public void setResulConvDH(JLabel resulConvDH) {
		this.resulConvDH = resulConvDH;
	}

	public JTextField getCampoDecDH() {
		return campoDecDH;
	}

	public void setCampoDecDH(JTextField campoDecDH) {
		this.campoDecDH = campoDecDH;
	}

	public JTextArea getCampoResulHex() {
		return campoResulHex;
	}

	public void setCampoResulHex(JTextArea campoResulHex) {
		this.campoResulHex = campoResulHex;
	}

	public JButton getbConvertirDH() {
		return bConvertirDH;
	}

	public void setbConvertirDH(JButton bConvertirDH) {
		this.bConvertirDH = bConvertirDH;
	}

	public JButton getbVolverDH() {
		return bVolverDH;
	}

	public void setbVolverDH(JButton bVolverDH) {
		this.bVolverDH = bVolverDH;
	}
	
}
