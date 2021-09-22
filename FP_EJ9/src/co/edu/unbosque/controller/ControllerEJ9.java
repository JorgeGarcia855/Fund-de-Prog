package co.edu.unbosque.controller;

import java.util.Scanner;

public class ControllerEJ9 {
    Scanner leer;
	
	public ControllerEJ9() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		double kgs = 0.0;
		double grs = 0.0;
		double lbs = 0.0;
		double tons = 0.0;
		String resul = "";
		
		System.out.println("Digite los kilogramos:");
		kgs = leer.nextDouble();
		
		if(kgs>0) {
			grs = kgs * 1000;
			lbs = kgs / 0.4535;
			tons = kgs / 1000;
			resul = "El valor en gramos es: "+grs + "\nEl valor en libras es: "+lbs + "\nEl valor en toneladas: "+tons;
		}else {
			resul = "Ingrese un valor valido.";
		}
		
		System.out.println(resul);
	}
}