package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {
	
	Scanner leer;
	
	public Controller() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		int ani = 0;
		int pat = 0;
		int vac = 0;
		int pol = 0;
		
		System.out.println("digite animales");
		ani = leer.nextInt();
		
		System.out.println("digite patas");
		pat = leer.nextInt();
		
		vac = (4*ani-pat)/2;
		pol = (pat-2*ani)/2;
		
		
		System.out.println(vac);
		System.out.println(pol);
		
		
		
		}
}
