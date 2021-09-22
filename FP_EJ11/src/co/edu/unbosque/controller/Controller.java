package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {
	
	Scanner leer;
	
	public Controller() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		double d = 0;
		String resul ="";
		
		
		System.out.println("Digite coordenada x1: ");
		x1 = leer.nextInt();
		
		System.out.println("Digite coordenada y1: ");
		y1 = leer.nextInt();
		
		System.out.println("Digite coordenada x2: ");
		x2 = leer.nextInt();
		
		System.out.println("Digite coordenada y2: ");
		y2 = leer.nextInt();
		
		d = Math.hypot((x2-x1), (y2-y1));
		resul = "La distencia es: " +d;
		
		System.out.println(resul);
	}
}
