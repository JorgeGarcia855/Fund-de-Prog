package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {
	
	Scanner leer;
	
	public Controller() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
	
		double seg = 0.0;
		double ac = 0.0;
		double dis = 0.0;
		String resul = "";
		
		System.out.println("Digite la aceleracion: ");
		ac = leer.nextDouble();
		
		System.out.println("Digite los segundos: ");
		seg = leer.nextDouble();
		
		if (seg>=0 && ac>=0) {
			dis = ac*seg;
			resul = "La distancia es: "+dis+"mts";
		}else {
			resul = "Debes usar valores positivos.";
		}
		
		System.out.println(resul);
		
	}
}
