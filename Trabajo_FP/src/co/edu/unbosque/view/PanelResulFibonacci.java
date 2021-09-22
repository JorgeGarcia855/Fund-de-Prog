package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelResulFibonacci extends JPanel{
	
	private JLabel etiqueta_rfibonacci;
	private JTextArea resultados_fibonacci;
	
	public PanelResulFibonacci() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {
		
		setBackground(Color.white);
		setBorder(new TitledBorder("Resultado Fibonacci"));
		
		etiqueta_rfibonacci = new JLabel("Se muestra la siguiente secuencia de Fibonacci:");
		etiqueta_rfibonacci.setBounds(20, 40, 280, 20);
		add(etiqueta_rfibonacci);
		
		resultados_fibonacci = new JTextArea();
		resultados_fibonacci.setBounds(60, 80, 220, 300);
		Border margen = BorderFactory.createLineBorder(Color.black);
		resultados_fibonacci.setBorder(margen);
		resultados_fibonacci.setEditable(false);
		add(resultados_fibonacci);
	}

	public JLabel getEtiqueta_rfibonacci() {
		return etiqueta_rfibonacci;
	}

	public void setEtiqueta_rfibonacci(JLabel etiqueta_rfibonacci) {
		this.etiqueta_rfibonacci = etiqueta_rfibonacci;
	}

	public JTextArea getResultados_fibonacci() {
		return resultados_fibonacci;
	}

	public void setResultados_fibonacci(JTextArea resultados_fibonacci) {
		this.resultados_fibonacci = resultados_fibonacci;
	}

}
