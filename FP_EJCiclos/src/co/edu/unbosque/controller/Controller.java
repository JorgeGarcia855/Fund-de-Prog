package co.edu.unbosque.controller;

import co.edu.unbosque.model.NumParImpar;
import co.edu.unbosque.view.ViewConsola;

public class Controller {
	
	private ViewConsola vista;
	private NumParImpar numero;
	
	public Controller() {
		vista = new ViewConsola();
		numero = new NumParImpar();
		funcionar();
	}
	
	public void funcionar() {
		vista.mostrarMensaje("Escribe numero entero: ");
		int n = vista.leerDato();
		numero.setNum(n);
		vista.mostrarMensaje("El numero "+numero.getNum()+" tiene "+numero.contadorPar()+" cifras pares.");
		vista.mostrarMensaje("El numero "+numero.getNum()+" tiene "+numero.contadorImpar()+" cifras impares.");
	}


	}
	