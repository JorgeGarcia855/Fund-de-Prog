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
public class PanelBinSum extends JPanel{
	
	private JLabel ingBin1, ingBin2, resulSuma;
	private JTextField campoBin1, campoBin2;
	private JTextArea campoResulSuma;
	private JButton bSuma, bVolverBS;
	
	public PanelBinSum() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		setBackground(Color.lightGray);
		
		ingBin1 = new JLabel("Ingrese primer binario:");
		ingBin1.setBounds(10, 20, 175, 15);
		add(ingBin1);
		
		campoBin1 = new JTextField();
		campoBin1.setBounds(10, 40, 175, 20);
		add(campoBin1);
		
		ingBin2 = new JLabel("Ingrese segundo binario:");
		ingBin2.setBounds(10, 60, 175, 15);
		add(ingBin2);
		
		campoBin2 = new JTextField();
		campoBin2.setBounds(10, 80, 175, 20);
		add(campoBin2);
		
		bSuma = new JButton("Sumar");
		bSuma.setBounds(190, 40, 80, 60);
		bSuma.setActionCommand("SUMA_BS");
		add(bSuma);
		
		resulSuma = new JLabel("El resultado de la suma es:");
		resulSuma.setBounds(10, 120, 200, 15);
		add(resulSuma);
		
		campoResulSuma = new JTextArea();
		campoResulSuma.setBounds(10, 140, 260, 250);
		campoResulSuma.setLineWrap(true);
		Border margen = BorderFactory.createLineBorder(Color.black);
		campoResulSuma.setBorder(margen);
		campoResulSuma.setEditable(false);
		add(campoResulSuma);
		
		bVolverBS = new JButton("Volver");
		bVolverBS.setBounds(10, 395, 100, 20);
		bVolverBS.setActionCommand("VOLVER_BS");
		add(bVolverBS);
		
	}

	public JLabel getIngBin1() {
		return ingBin1;
	}

	public void setIngBin1(JLabel ingBin1) {
		this.ingBin1 = ingBin1;
	}

	public JLabel getIngBin2() {
		return ingBin2;
	}

	public void setIngBin2(JLabel ingBin2) {
		this.ingBin2 = ingBin2;
	}

	public JLabel getResulSuma() {
		return resulSuma;
	}

	public void setResulSuma(JLabel resulSuma) {
		this.resulSuma = resulSuma;
	}

	public JTextField getCampoBin1() {
		return campoBin1;
	}

	public void setCampoBin1(JTextField campoBin1) {
		this.campoBin1 = campoBin1;
	}

	public JTextField getCampoBin2() {
		return campoBin2;
	}

	public void setCampoBin2(JTextField campoBin2) {
		this.campoBin2 = campoBin2;
	}

	public JTextArea getCampoResulSuma() {
		return campoResulSuma;
	}

	public void setCampoResulSuma(JTextArea campoResulSuma) {
		this.campoResulSuma = campoResulSuma;
	}

	public JButton getbSuma() {
		return bSuma;
	}

	public void setbSuma(JButton bSuma) {
		this.bSuma = bSuma;
	}

	public JButton getbVolverBS() {
		return bVolverBS;
	}

	public void setbVolverBS(JButton bVolverBS) {
		this.bVolverBS = bVolverBS;
	}
	
}
