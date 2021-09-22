package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {

	private static final Scanner leer = new Scanner(System.in);
	
	public Controller() {
        System.out.println(funcionar());
	}
	
	public String funcionar() {
		double ianual = 0.27;
		String resul;
		System.out.println("Digite prestamo:");
		double p = leer.nextDouble();
		if (p>=0) {
			double imensual = (p*(1+ianual*1/12))-p;
			resul = "El interes mensual es de: "+ imensual;
		}else {
			resul = "No funciona numeros negativos!";
		}
		return resul;
	}
}