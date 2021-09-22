package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelDatos extends JPanel{
	
	private JLabel etnumero;
	private JTextField campo_numero;
	private JButton btgenerar;
	
	public PanelDatos() {
		setLayout(new GridLayout(5,1));
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		setBackground(Color.magenta);
		setPreferredSize(new Dimension(300,330));
		setBorder(new TitledBorder("Modulo de ingreso"));
		
		JLabel aux = new JLabel();
		add(aux);
		
		etnumero = new JLabel("Numero: ");
		add(etnumero);
		
		campo_numero = new JTextField();
		add(campo_numero);
		
		add(aux);
		
		btgenerar = new JButton("Generar");
		btgenerar.setActionCommand("GENERAR");
		add(btgenerar);
	}

	public JLabel getEtnumero() {
		return etnumero;
	}

	public void setEtnumero(JLabel etnumero) {
		this.etnumero = etnumero;
	}

	public JTextField getCampo_numero() {
		return campo_numero;
	}

	public void setCampo_numero(JTextField campo_numero) {
		this.campo_numero = campo_numero;
	}

	public JButton getBtgenerar() {
		return btgenerar;
	}

	public void setBtgenerar(JButton btgenerar) {
		this.btgenerar = btgenerar;
	}
	
	
}
