package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {
	
	private static Scanner leer;
	
	public Controller() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		double radio;
	    double altura;
		double volumen;
		String resul;

        System.out.println("""
                =====================================================================
                PROGRAMA QUE CALCULA EL VOLUMEN DE UN CILINDRO
                Mediante el ingreso del radio y la altura
                Donde el radio y la  altura ingresada debe ser un entero positivo
                =====================================================================
                
                """);

		System.out.println("Digite radio: ");
		radio = leer.nextDouble();

		System.out.println("Digite altura: ");
		altura = leer.nextDouble();

		if(radio >= 0 && altura>=0) {
			volumen = radio * radio * altura * Math.PI;
			resul = "El volumen es "+volumen;
		}else {
			resul = "Ingresate un numero negativo!!!!";
		}
		System.out.println(resul);
	}
}	


