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
		vista.mostrarMensaje("Estamos mostrando los numeros comprendidos entre 25 y 205 terminados en 6");
		vista.mostrarMensaje(""+ciclos.ejercicio9());
		}
		
	}
	


