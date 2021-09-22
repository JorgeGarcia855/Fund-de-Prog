package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {
	
	Scanner leer;
	
	public Controller() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		double km = 0.0;
		double precio = 0.0;
		double usdp = 30.0;
		double usdkm1 = 2.0;
		double usdkm2 = 1.0;
		String resul = "";
		
		System.out.println("Digite los Kilometros: ");
		km = leer.nextDouble();
		
		if(km>0 && km<=300) {
			resul = "El precio del alquiler es de: "+usdp;
		}else if (km>300 && km<=1000) {
			precio = usdp+((km-300)*usdkm1);
			resul = "El precio del alquiler es de: "+precio+" dolares";
		}else if (km>1000) {
			precio = ((usdp+(700*usdkm1))+((km-1000)*usdkm2));
			resul = "El precio del alquiler es de: "+precio+" dolares";
		}else {
			resul = "Señor usuario digito mal la condicion.";
		}
		System.out.println(resul);
	}
}
