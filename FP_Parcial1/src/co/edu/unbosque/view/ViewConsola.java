package co.edu.unbosque.view;
import java.util.Scanner;

public class ViewConsola {
	public Scanner leer;
	
	public ViewConsola() {
		leer = new Scanner(System.in);
	}
	
	public int leerDato() {
		int serial = 0;
		System.out.println("Digite el numero serial del carro: ");
		serial = leer.nextInt();
		return serial;
	}
	
	public void mostrarInformacion(String resul) {
		System.out.println(resul);
	}

}
