package co.edu.unbosque.view;

import java.util.Scanner;

public class ViewConsola {
	
	public Scanner leer;
			
	public ViewConsola(){
		leer = new Scanner(System.in);
	}
			
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
			
	public String leerDato(String mensaje) {
		mostrarMensaje(mensaje);
		String dato = "";
		dato = leer.nextLine();
		return dato;
	}
}



