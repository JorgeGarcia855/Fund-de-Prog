package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {
	
	Scanner leer;
	
	public Controller() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		int sdc = 0;
		String resul = "";
		
		System.out.println("Digite el numero serial del carro: ");
		sdc = leer.nextInt();
		
		if(sdc>0) {
			if(sdc>=14681 && sdc<=15681) {
				resul = "El automovil esta defectuoso";
			}else if(sdc>=70001 && sdc<=79999) {
				resul = "El automovil esta defectuoso";
			}else if(sdc>=88888 && sdc<=111111){
				resul = "El automovil esta defectuoso";
			}else {
				resul = "El automovil esta en buenas condiciones";
			}
		}else {
			resul = "Ingrese un numero valido";
		}
		System.out.println(resul);
	}
}
