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
		ciclos.setNum(n);
		vista.mostrarMensaje(""+ciclos.ejercicio24());
	}
}

	


