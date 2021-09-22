package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelResulTexto extends JPanel{
	
private JLabel etiqueta_rtexto;
	
	public PanelResulTexto() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.white);
		setBorder(new TitledBorder("Resultado Contador de Espacios"));
		
		etiqueta_rtexto = new JLabel();
		etiqueta_rtexto.setBounds(50, 125, 250, 20);
		add(etiqueta_rtexto);
		
	}

	public JLabel getEtiqueta_rtexto() {
		return etiqueta_rtexto;
	}

	public void setEtiqueta_rtexto(JLabel etiqueta_rtexto) {
		this.etiqueta_rtexto = etiqueta_rtexto;
	}
	
	

}
