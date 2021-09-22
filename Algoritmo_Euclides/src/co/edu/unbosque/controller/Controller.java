package co.edu.unbosque.controller;


import co.edu.unbosque.model.Euclides;
import co.edu.unbosque.view.ViewVentana;

public class Controller {
	
	private ViewVentana vista;
	private Euclides numero;
	
	public Controller() {
		vista = new ViewVentana();
		numero = new Euclides();
		funcionar();
	}
	
	public void funcionar() {
		int n1 = vista.leerDato("Ingrese primer numero: ");
		numero.setNum(n1);
		int n2 = vista.leerDato("Ingrese segundo numero: ");
		numero.setNum2(n2);
		if(n1 <= 0 || n2 <= 0) {
			vista.mostrarMensaje("Ingresaste valores incorrectos.", "error");
		}else if (n1<n2){
			vista.mostrarMensaje("El primer valor debe ser mayor que el segundo.", "error");
		}else {
			vista.mostrarMensaje("El MCD de "+ numero.getNum()+" y "+numero.getNum2()+" es: "+ numero.algoritmoMCD(), "informativo");
		}
	}
	
	}


