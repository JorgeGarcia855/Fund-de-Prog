package co.edu.unbosque.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Frase;
import co.edu.unbosque.model.Numero;
import co.edu.unbosque.model.NumeroHexadecimal;
import co.edu.unbosque.view.VentanaBienvenidos;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {
	
	private VentanaBienvenidos ventana_inicial;
	private VentanaPrincipal ventana_principal;
	private Numero num;
	private Frase frase;
	private NumeroHexadecimal hexa;
	
	public Controller() {
		ventana_inicial = new VentanaBienvenidos();
		ventana_principal = new VentanaPrincipal();
		num = new Numero();
		frase = new Frase();
		hexa = new NumeroHexadecimal();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana_inicial.getPi().getBtingresar().addActionListener(this);
		ventana_principal.getPseleccion().getMenu_operaciones().addActionListener(this);
		ventana_principal.getPfibo().getBtOperacion().addActionListener(this);
		ventana_principal.getpEspacios().getBtOperacion().addActionListener(this);
		ventana_principal.getPhexa().getBtOperacion().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("INGRESAR")) {
			ventana_inicial.setVisible(false);
			ventana_principal.setVisible(true);
		}else if(e.getActionCommand().equals("OPERACIONES")) {
			String opcion = ventana_principal.getPseleccion().getMenu_operaciones().getSelectedItem().toString();
			ventana_principal.remove(ventana_principal.getPblanco());
			if(opcion.equals("Ej. Fibonacci")) {
				ventana_principal.remove(ventana_principal.getpEspacios());
				ventana_principal.remove(ventana_principal.getPhexa());
				ventana_principal.add(ventana_principal.getPfibo(), BorderLayout.WEST);
				ventana_principal.getPfibo().setVisible(true);
			}else if(opcion.equals("Ej. Contar Espacios")) {
				ventana_principal.remove(ventana_principal.getPfibo());
				ventana_principal.remove(ventana_principal.getPhexa());
				ventana_principal.add(ventana_principal.getpEspacios(), BorderLayout.WEST);
				ventana_principal.getpEspacios().setVisible(true);
			}else if(opcion.equals("Ej. Conversion Hex-Dec")) {
				ventana_principal.remove(ventana_principal.getPfibo());
				ventana_principal.remove(ventana_principal.getpEspacios());
				ventana_principal.add(ventana_principal.getPhexa(), BorderLayout.WEST);
				ventana_principal.getPhexa().setVisible(true);
			}
			ventana_principal.repaint();
		}else if(e.getActionCommand().equals("GENERAR")) {
			try {
				String aux = ventana_principal.getPfibo().getCampo_numero().getText();
				int n = Integer.parseInt(aux);
				num.setN(n);
				String resul = num.generarSerieFibo();
				ventana_principal.getPresultados().getArea_resultados().setText(resul);
			}catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Error: No se puede ingresar letras.", "Error", JOptionPane.ERROR_MESSAGE);
				ventana_principal.getPfibo().getCampo_numero().setText("");
			}
		}else if(e.getActionCommand().equals("BUSCAR")) {
			String aux2 = ventana_principal.getpEspacios().getCampo_numero().getText();
			frase.setFrase(aux2);
			int cont = frase.contarEspacios();
			ventana_principal.getPresultados().getArea_resultados().setText("La frase: "+aux2+ " tiene "+cont+ " espacios en blanco");
		}else if(e.getActionCommand().equals("CONVERTIR")) {
			String aux2 = ventana_principal.getPhexa().getCampo_numero().getText();
			hexa.setNumero(aux2);
			int resp = (int)hexa.conversionHexDec();
			if (resp != -1) {
				ventana_principal.getPresultados().getArea_resultados().setText("El numero en decimal es: "+resp);
			}else {
				JOptionPane.showMessageDialog(null,"Error: Ingreso numero invalido.", "Error", JOptionPane.ERROR_MESSAGE );
				ventana_principal.getPhexa().getCampo_numero().setText("");
			}
			
		}
	}

}
