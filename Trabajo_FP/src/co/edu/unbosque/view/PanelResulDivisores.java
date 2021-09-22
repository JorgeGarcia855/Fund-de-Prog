package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelResulDivisores extends JPanel {
	
	private JLabel etiqueta_rdivisores;
	private JTextArea resultados_divisores;
	
	public PanelResulDivisores() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {
		
		setBackground(Color.white);
		setBorder(new TitledBorder("Resultado Divisores"));
		
		etiqueta_rdivisores = new JLabel("Se muestran los divisores del numero:");
		etiqueta_rdivisores.setBounds(20, 40, 280, 20);
		add(etiqueta_rdivisores);
		
		resultados_divisores = new JTextArea();
		resultados_divisores.setBounds(60, 80, 220, 300);
		Border margen = BorderFactory.createLineBorder(Color.black);
		resultados_divisores.setBorder(margen);
		resultados_divisores.setEditable(false);
		add(resultados_divisores);
		
	}

	public JLabel getEtiqueta_rdivisores() {
		return etiqueta_rdivisores;
	}

	public void setEtiqueta_rdivisores(JLabel etiqueta_rdivisores) {
		this.etiqueta_rdivisores = etiqueta_rdivisores;
	}

	public JTextArea getResultados_divisores() {
		return resultados_divisores;
	}

	public void setResultados_divisores(JTextArea resultados_divisores) {
		this.resultados_divisores = resultados_divisores;
	}
	
	

}
