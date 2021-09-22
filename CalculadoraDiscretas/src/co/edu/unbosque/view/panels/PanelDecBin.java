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
public class PanelDecBin extends JPanel{
	
	private JLabel ingresarDecDB, resulConvDB;
	private JTextField campoDecDB;
	private JTextArea campoResulBin;
	private JButton bConvertirDB, bVolverDB;
	
	public PanelDecBin() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		setBackground(Color.lightGray);
		
		ingresarDecDB = new JLabel("Ingrese numero a convertir:");
		ingresarDecDB.setBounds(10, 20, 175, 15);
		add(ingresarDecDB);
		
		campoDecDB = new JTextField();
		campoDecDB.setBounds(10, 40, 250, 20);
		add(campoDecDB);
		
		bConvertirDB = new JButton("Convertir");
		bConvertirDB.setBounds(10, 70, 250, 20);
		bConvertirDB.setActionCommand("CONVERTIR_DB");
		add(bConvertirDB);
		
		resulConvDB = new JLabel("El resultado binario es:");
		resulConvDB.setBounds(10, 100, 200, 15);
		add(resulConvDB);
		
		campoResulBin = new JTextArea();
		campoResulBin.setBounds(10, 120, 250, 250);
		campoResulBin.setLineWrap(true);
		Border margen = BorderFactory.createLineBorder(Color.black);
		campoResulBin.setBorder(margen);
		campoResulBin.setEditable(false);
		add(campoResulBin);
		
		bVolverDB = new JButton("Volver");
		bVolverDB.setBounds(10, 375, 100, 20);
		bVolverDB.setActionCommand("VOLVER_DB");
		add(bVolverDB);
		
	}

	public JLabel getIngresarDecDB() {
		return ingresarDecDB;
	}

	public void setIngresarDecDB(JLabel ingresarDecDB) {
		this.ingresarDecDB = ingresarDecDB;
	}

	public JLabel getResulConvDB() {
		return resulConvDB;
	}

	public void setResulConvDB(JLabel resulConvDB) {
		this.resulConvDB = resulConvDB;
	}

	public JTextField getCampoDecDB() {
		return campoDecDB;
	}

	public void setCampoDecDB(JTextField campoDecDB) {
		this.campoDecDB = campoDecDB;
	}

	public JTextArea getCampoResulBin() {
		return campoResulBin;
	}

	public void setCampoResulBin(JTextArea campoResulBin) {
		this.campoResulBin = campoResulBin;
	}

	public JButton getbConvertirDB() {
		return bConvertirDB;
	}

	public void setbConvertirDB(JButton bConvertirDB) {
		this.bConvertirDB = bConvertirDB;
	}

	public JButton getbVolverDB() {
		return bVolverDB;
	}

	public void setbVolverDB(JButton bVolverDB) {
		this.bVolverDB = bVolverDB;
	}

}
