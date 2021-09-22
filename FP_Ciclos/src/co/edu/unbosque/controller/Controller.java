package co.edu.unbosque.controller;
import co.edu.unbosque.model.TablaMutiplicar;
import co.edu.unbosque.view.ViewConsola;

public class Controller {
	
	public ViewConsola vista;
	public TablaMutiplicar tabla_multiplicar;
	
	public Controller() {
		vista = new ViewConsola();
		tabla_multiplicar = new TablaMutiplicar();
		funcionar();
	}
	
	public void funcionar() {
		vista.mostrarMensaje("Ingrear numero para hallar la tabla de multiplicacion: ");
		tabla_multiplicar.numero = vista.leerDato();
		vista.mostrarMensaje("Ingresar hasta que numero: ");
		int n = vista.leerDato();
		String respuesta = tabla_multiplicar.hacerTablaConCiclos(n);
		vista.mostrarMensaje("La tabla de multiplicar del es:\n"+respuesta);
	}
	
}
