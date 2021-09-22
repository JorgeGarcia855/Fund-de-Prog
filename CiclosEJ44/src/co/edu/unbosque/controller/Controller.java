package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ciclos;
import co.edu.unbosque.view.ViewConsola;

public class Controller {
	
	private ViewConsola vista;
	private Ciclos ciclos;
	
	public Controller() {
		vista = new ViewConsola();
		ciclos = new Ciclos();
		funcionar();
	}
	
	public void funcionar(){
		vista.mostrarMensaje("Ingrese numero entero: ");
		int n = vista.leerDato();
		if(n>0) {
			ciclos.setNum(n);
			vista.mostrarMensaje(""+ciclos.ejercicio44());
		}else {
			vista.mostrarMensaje("No funciona con numeros negativos.");
		}
		
	}
}

	


