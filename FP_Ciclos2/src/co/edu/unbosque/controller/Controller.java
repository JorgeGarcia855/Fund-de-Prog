package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.ViewConsola;

public class Controller {
	
	private final ViewConsola vista;
	
	public Controller() {
		vista = new ViewConsola();
		funcionar();
	}
	
	public void funcionar() {
		vista.mostrarMensaje("Ingrese numero entero: ");
		int n = vista.leerDato();
		int c = Numero.contarCifras(n);
		vista.mostrarMensaje("El numero "+n+" tiene "+c+" cifras");
		vista.mostrarMensaje("El numero "+n+" es primo? "+ Numero.esPrimo(n));
		vista.mostrarMensaje("El numero "+n+" es primo? "+ Numero.esPrimo2(n));
		vista.mostrarMensaje("La cantidad de divisores del numero "+n+" son: "+Numero.numeroDivisores(n));
		vista.mostrarMensaje("Los divisores del numero "+n+" son: \n"+Numero.divisores(n));
	}

}
