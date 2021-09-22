package co.edu.unbosque.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Frase;
import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.VentanaBienvenidos;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	
	private VentanaBienvenidos ventana_inicial;
	private VentanaPrincipal ventana_principal;
	private Numero num;
	private Frase frase;
	
	public Controller() {
		ventana_inicial = new VentanaBienvenidos();
		ventana_principal = new VentanaPrincipal();
		num = new Numero();
		frase = new Frase();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana_inicial.getPi().getBtingresar().addActionListener(this);
		ventana_principal.getPseleccion().getMenu_operaciones().addActionListener(this);
		ventana_principal.getPfibo().getBtgenerar().addActionListener(this);
		ventana_principal.getpEspacios().getBtgenerar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("INGRESAR")) {
			ventana_inicial.setVisible(false);
			ventana_principal.setVisible(true);
		}else if(e.getActionCommand().equals("OPERACIONES")) {
			String opcion = ventana_principal.getPseleccion().getMenu_operaciones().getSelectedItem().toString();
			if(opcion.equals("Ej. Fibonacci")) {
				ventana_principal.remove(ventana_principal.getpEspacios());
				ventana_principal.add(ventana_principal.getPfibo(), BorderLayout.WEST);
				ventana_principal.getPfibo().setVisible(true);
			}else if (opcion.equals("Ej. Contar Espacios")) {
				ventana_principal.remove(ventana_principal.getPfibo());
				ventana_principal.add(ventana_principal.getpEspacios(), BorderLayout.WEST);
				ventana_principal.getpEspacios().setVisible(true);
			}
			ventana_principal.repaint();
		}else if(e.getActionCommand().equals("GENERAR")) {
			String aux = ventana_principal.getPfibo().getCampo_numero().getText();
			int n = Integer.parseInt(aux);
			num.setN(n);
			String resul = num.generarSerieFibo();
			ventana_principal.getPresultados().getArea_resultados().setText(resul);
		}else if(e.getActionCommand().equals("BUSCAR")) {
			String aux2 = ventana_principal.getpEspacios().getCampo_numero().getText();
			frase.setFrase(aux2);
			int cont = frase.contarEspacios();
			ventana_principal.getPresultados().getArea_resultados().setText("La frase: "+ aux2+" tiene "+ cont +" espacios en blanco.");
		}
	}

}
