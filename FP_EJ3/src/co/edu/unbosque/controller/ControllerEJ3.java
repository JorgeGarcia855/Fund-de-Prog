package co.edu.unbosque.controller;

import java.util.Scanner;

public class ControllerEJ3 {
	private static final Scanner leer = new Scanner(System.in);
	
	public ControllerEJ3() {
		funcionar();
	}
	
	public static void funcionar() {
		double ppkm = 120.0;
		String resul;
		System.out.println("Digite la cantidad de km: ");
		double km = leer.nextDouble();
		if (km>=0) {
			double bdv = km*ppkm;
			resul = "El precio del boleto de viaje es de: $"+ bdv;
	    }else {
	    	resul ="No se puede calcular con un valor negativo.";
	    }
		System.out.println(resul);
	}
}
