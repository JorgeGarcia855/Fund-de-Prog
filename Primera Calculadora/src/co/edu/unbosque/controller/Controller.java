package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {
	
	private VentanaPrincipal vista;
	private Numero a;
	private Numero b;
	
	public Controller() {
		vista = new VentanaPrincipal();
		a = new Numero();
		b = new Numero();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPdatos().getBoton_suma().addActionListener(this);
		vista.getPdatos().getBoton_resta().addActionListener(this);
		vista.getPdatos().getBoton_multi().addActionListener(this);
		vista.getPdatos().getBoton_dividir().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String aux = "";
		double aux2 = 0.0;
		if(e.getActionCommand().equals("SUMAR")) {
			try {
				aux = vista.getPdatos().getCampo_numero1().getText();
				aux2 = Double.parseDouble(aux);
				a.setNum(aux2);
				
				aux = vista.getPdatos().getCampo_numero2().getText();
				aux2 = Double.parseDouble(aux);
				b.setNum(aux2);
				
				vista.getPresul().getEtiqueta_resultados().setText("El resultado de la suma es: "+a.sumar(b));
			}catch(NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero en ambos campos","Error",JOptionPane.ERROR_MESSAGE);
				vista.getPdatos().getCampo_numero1().setText("");
				vista.getPdatos().getCampo_numero2().setText("");
				vista.getPresul().getEtiqueta_resultados().setText("");
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: Ingrese un ","Error",JOptionPane.ERROR_MESSAGE);
				vista.getPdatos().getCampo_numero1().setText("");
				vista.getPdatos().getCampo_numero2().setText("");
				vista.getPresul().getEtiqueta_resultados().setText("");
			}
			
			
		}else if(e.getActionCommand().equals("RESTAR")) {

			aux = vista.getPdatos().getCampo_numero1().getText();
			aux2 = Double.parseDouble(aux);
			a.setNum(aux2);
			
			aux = vista.getPdatos().getCampo_numero2().getText();
			aux2 = Double.parseDouble(aux);
			b.setNum(aux2);
			
			vista.getPresul().getEtiqueta_resultados().setText("El resultado de la resta es: "+a.restar(b));
			
		}else if(e.getActionCommand().equals("MULTIPLICAR")) {

			aux = vista.getPdatos().getCampo_numero1().getText();
			aux2 = Double.parseDouble(aux);
			a.setNum(aux2);
			
			aux = vista.getPdatos().getCampo_numero2().getText();
			aux2 = Double.parseDouble(aux);
			b.setNum(aux2);
			
			vista.getPresul().getEtiqueta_resultados().setText("El resultado de la multiplicacion es: "+a.multiplicar(b));
			
		}else if(e.getActionCommand().equals("DIVIDIR")) {

			aux = vista.getPdatos().getCampo_numero1().getText();
			aux2 = Double.parseDouble(aux);
			a.setNum(aux2);
			
			aux = vista.getPdatos().getCampo_numero2().getText();
			aux2 = Double.parseDouble(aux);
			b.setNum(aux2);
			
			vista.getPresul().getEtiqueta_resultados().setText("El resultado de la division es: "+a.dividir(b));
		}
		
	}
	
}
