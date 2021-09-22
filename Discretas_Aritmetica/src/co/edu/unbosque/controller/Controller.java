package co.edu.unbosque.controller;

import co.edu.unbosque.model.Teorema;
import co.edu.unbosque.view.ViewVentana;

public class Controller {
	
	private ViewVentana vista;
	private Teorema numero;
	
	public Controller() {
		vista = new ViewVentana();
		numero = new Teorema();
		funcionar();
	}
	
	public void funcionar() {
		int n = vista.leerDato("Ingrese numero entero: ");
		numero.setNum(n);
		if(n>0) {
			vista.mostrarMensaje("Los divisores de "+ numero.getNum()+" son: "+ numero.contadorDivisores(), "informativo");
		}else {
			vista.mostrarMensaje("No funciona con numeros negativos.", "error");
		}
		
	}
}
