package co.edu.unbosque.controller;

import java.util.Scanner;

public class ControllerEJ8 {
    Scanner leer;
	
	public ControllerEJ8() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		double mts = 0.0;
		double ft =  3.28;
		double in = 39.37;
		double cft = 0.0;
		double cin = 0.0;
		String resul = "";
		
		System.out.println("Ingrese el valor a convertir en metros:");
		mts = leer.nextDouble();
		
		if(mts>0) {
			cft = mts*ft;
			cin = mts*in;
			resul = "El valor de metros a pies es de: "+cft + "\nEl valor de metros a pulgadas es de: "+cin;
		}else {
			resul = "Ingrese un valor valido.";
		}
		
		System.out.println(resul);
	
	}
		
		

}
