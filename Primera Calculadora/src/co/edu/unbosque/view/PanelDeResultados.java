package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelDeResultados extends JPanel{
	
	private JLabel etiqueta_resultados;
	
	public PanelDeResultados() {
		
		setLayout(null);
		
		inicializarComponentes();
		
		setVisible(true);
		
	}
	
	public void inicializarComponentes() {
		
		setBackground(new Color(225,225,225));
		setBorder(new TitledBorder("Resultado"));
		
		etiqueta_resultados = new JLabel();
		etiqueta_resultados.setBounds(150, 75, 250, 20);
		add(etiqueta_resultados);
		
	}

	public JLabel getEtiqueta_resultados() {
		return etiqueta_resultados;
	}

	public void setEtiqueta_resultados(JLabel etiqueta_resultados) {
		this.etiqueta_resultados = etiqueta_resultados;
	}

}
