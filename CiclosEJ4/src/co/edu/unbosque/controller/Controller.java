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
	
	public void funcionar() {
		vista.mostrarMensaje("Ingrese primer numero: ");
		int n = vista.leerDato();
		ciclos.setNum(n);
		vista.mostrarMensaje("Ingrese segundo numero: ");
		int n2 = vista.leerDato();
		ciclos.setNum2(n2);
		
		if(n<n2) {
			vista.mostrarMensaje("Los numeros comprendidos entre "+ciclos.getNum()+" y "+ ciclos.getNum2()+" son los siguientes: ");
			vista.mostrarMensaje(""+ciclos.ejercicio4());
		}else {
			vista.mostrarMensaje("Ingresaste valores incorrectos.");
		}
	}
	

}
