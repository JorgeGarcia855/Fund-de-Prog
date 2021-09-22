package co.edu.unbosque.controller;

import java.util.Scanner;

public class ControllerEJ7 {
Scanner leer;
	
	public ControllerEJ7() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		
		int[] arrayInt = new int[3];
		String resul ="";
		
		System.out.println("Digite la centesima:");
		arrayInt[0]= leer.nextInt();
		
		System.out.println("Digite la decima: ");
		arrayInt[1] = leer.nextInt();
		
		System.out.println("Digite la unidad: ");
		arrayInt[2] = leer.nextInt();
		
		if (arrayInt[0]>=0 && arrayInt[1]>=0 && arrayInt[2]>=0) {
			resul = "El resultado es: "+arrayInt[0]+arrayInt[1]+arrayInt[2];
		}else {
			resul = "No puedes poner numeros negativos.";
		}
		System.out.println(resul);	
	}
}
