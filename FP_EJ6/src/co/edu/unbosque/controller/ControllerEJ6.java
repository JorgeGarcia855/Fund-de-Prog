package co.edu.unbosque.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerEJ6 {
	
    Scanner leer;
	
	public ControllerEJ6() {
		leer = new Scanner(System.in);
	}
	
	public void ej6() {
		double cps = 3.25;
		String resul;
		System.out.println("Digite la hora: ");
		int h = leer.nextInt();
		System.out.println("Digite los minutos: ");
		int m = leer.nextInt();
		System.out.println("Digite los segundos: ");
		int s = leer.nextInt();

		if(h>=0 && m>=0 && s>=0) {
			int aux1 = h*60; // Volviendo a las horas a minutos
			int aux2 = (aux1+ m)*60 ; //totalizando minutos en segundos
			int aux3 = s+aux2; //sumatoria de todos los segundos
			double total = aux3*cps;
			resul = "Los segundos son: "+aux3 + "\nEl resultado es: $"+total;
		}else {
			resul = "No funciona con valores negativos!";
		}

		System.out.print(resul);
		System.out.println("Se muestra los 10 primeros elementos de la serie de Fibonacci");
		int[] fib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
		for (int i = 0; i < fib.length; i++) {
			System.out.println(fib[i]+"\n");
		}

		
		int[] a = new int[10];
		System.out.println("tamaño arreglo");
		int size = leer.nextInt();
		System.out.println("ingrese valores del arreglo");
		for (int i = 0; i < size; i++) {
			a[i]=leer.nextInt();
		}
		
		//repetidorArreglo(a, size);
		//promedioArreglo(a, size);
		//minArreglo(a, size);	
		//ejercicio29(a, size);
		ejercicio39(a, size);
	}
	
	public void ejercicio4() { //funciona

	}
	
	public void repetidorArreglo(int[] a, int n) {  //ejercicio 9
		@SuppressWarnings("unused")
		int cont;
		int max = Arrays.stream(a).max().getAsInt();
		for (int i = 0; i < n; i++) {
			cont = 0;
			for (int j = 0; j < n; j++) {
				if (a[i]==a[j] && i!=j && a[i] == max) {
					System.out.println(a[i]+" ");
				}
			}
		}
	}
		
	public void promedioArreglo(int[] a, int n) { //ejercicio 14 funciona
		int total = 0;
		int cont = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
			
		}
		int promedio = total/a.length;
		System.out.println("El promedio es de: "+promedio);
		for (int i = 0; i < n; i++) {
			cont = 1;
			for (int j = 0; j < n; j++) {
				if (a[i]==a[j] && i!=j && a[i] == promedio) {
					cont++;
				}
			}
		}
		System.out.println("El promedio se repite "+cont+" veces.");
	
	}
	
	public void minArreglo(int a[], int n) { //ejercicio 19 funciona
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println("El valor minimo del arreglo es "+ min);
	}
	
	public void ejercicio29(int a[], int n) {
		int x = 1;
		for (int i = 0; i < n; i++) {
			while(x < a[i]-1) {
				x= x+1;
				System.out.println(x);
			}
			
		}
			
			
	}
	
	public void ejercicio39(int a[], int n) {
		int min = Arrays.stream(a).min().getAsInt();
		int max = Arrays.stream(a).max().getAsInt();
		int semisuma = (min+max)/2;
		System.out.println("La semisuma de "+min+" y "+max+" es: "+semisuma);
	}
	
	
}
