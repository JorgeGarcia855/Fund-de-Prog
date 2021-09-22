package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Operaciones;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	
	private VentanaPrincipal vista;
	private Operaciones a;
	private Operaciones b;
	private Operaciones txt;
	
	public Controller() {
		vista = new VentanaPrincipal();
		a = new Operaciones();
		b = new Operaciones();
		txt = new Operaciones();
		asignarOyentes();
	}

	public void asignarOyentes() {
		vista.getPfibonacci().getBoton_fibonacci().addActionListener(this);
		vista.getPdivisores().getBoton_divisores().addActionListener(this);
		vista.getPtexto().getBoton_texto().addActionListener(this);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String aux = "";
		int aux2 = 0;
		String aux3 = "";
		if(e.getActionCommand().equals("GENERAR SECUENCIA")) {
			aux = vista.getPfibonacci().getCampo_numero1().getText();
			aux2 = Integer.parseInt(aux);
			a.setNum(aux2);
			vista.getPrfibonacci().getResultados_fibonacci().setText(a.fibonacci(a));
			
		}else if(e.getActionCommand().equals("GENERAR DIVISORES")) {
			aux = vista.getPdivisores().getCampo_numero2().getText();
			aux2 = Integer.parseInt(aux);
			b.setNum(aux2);
			vista.getPrdivisores().getResultados_divisores().setText(b.contadorDivisores(b));
			
		}else if(e.getActionCommand().equals("CONTAR ESPACIOS")) {
			aux = vista.getPtexto().getCampo_numero3().getText();
			aux3 = aux;
			txt.setTexto(aux3);
			vista.getPrtexto().getEtiqueta_rtexto().setText("La cantidad de espacios en blanco es de: "+txt.contadorEspacios(txt));
		}
	}
	

}
