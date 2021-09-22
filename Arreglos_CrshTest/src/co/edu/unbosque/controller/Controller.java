package co.edu.unbosque.controller;

import java.util.Arrays;

import co.edu.unbosque.view.ViewConsola;

public class Controller {
	
	
	
	
	private ViewConsola vista;
	
	public Controller() {
		
		vista = new ViewConsola();
		funcionar();
	}
	
	public void funcionar() {
		inicializarArreglo();
	
	}
	
	public void inicializarArreglo() {
		int[] a = new int[10];
		System.out.println("tamaño arreglo");
		int tam = vista.leer.nextInt();
		System.out.println("ingrese valores del arreglo");
		for (int i = 0; i < tam; i++) {
			a[i]=vista.leer.nextInt();
		}
		repetidorArreglo(a, tam);
	}
	
	public void repetidorArreglo(int a[], int n) {  //ejercicio 9
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
	
	public void promedioArreglo(int a[], int n) { //ejercicio 14
		int total = 0;
		int cont = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
			
		}
		int promedio = total/a.length;
		System.out.println("El promedio es de: "+promedio);
		for (int i = 0; i < n; i++) {
			cont = 0;
			for (int j = 0; j < n; j++) {
				if (a[i]==a[j] && i!=j && a[i] == promedio) {
					cont++;
				}
			}
		}
		System.out.println("El promedio se repite "+cont+" veces.");
	
	}
	
	public void minArreglo(int a[], int n) { //ejercicio 19
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println("El minimo del arreglo es "+ min);
	}
	
}
