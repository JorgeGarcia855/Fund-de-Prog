package co.edu.unbosque.controller;

import java.util.Scanner;

public class ControllerEJ4 {

    private static final Scanner leer = new Scanner(System.in);
	
	public ControllerEJ4() {
		funcionar();
	}
	
	public void funcionar() {
		double usd = 2950.0, eur = 3450.0;
		String resul;
		System.out.println("Digite la cantidad de pesos: ");
		double cop = leer.nextDouble();
		
		if (cop>0) {
			double cusd = cop/usd;
			double ceur = cop/eur;
			resul = "El cambio de pesos a dolares fue de: $"+cusd + "\nEl cambio de pesos a euros fue de: €"+ ceur;
		} else {
			resul = "Ingrese un valor valido.";
		}
		System.out.println(resul);
	}
}
