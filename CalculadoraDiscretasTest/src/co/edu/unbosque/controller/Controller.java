package co.edu.unbosque.controller;

import java.util.InputMismatchException;

import co.edu.unbosque.model.BinSuma;
import co.edu.unbosque.model.Dec_Bin;
import co.edu.unbosque.model.Dec_Hex;
import co.edu.unbosque.view.ViewConsola;

public class Controller {
	
	private ViewConsola vista;
	private Dec_Bin dbin;
	private Dec_Hex dhex;
	private BinSuma bsum;
	private int n, opcion;
	private long b1, b2;
	
	
	public Controller() {
		vista = new ViewConsola();
		dbin = new Dec_Bin();
		dhex = new Dec_Hex();
		bsum = new BinSuma();
		menu();
	}
	
	public void menu() {
		try {
			do {
				vista.mostrarMensaje("Escoja que calcular: "
						+ "\n1. Convertir numero decimal a binario"
						+ "\n2. Convertir numero decimal a hexadecimal"
						+ "\n3. Hacer suma de numeros binarios"
						+ "\n4. Cerrar el programa");
				opcion = vista.leerDato();
		
				switch (opcion){
					case 1:
						convertirDecBin();
						break;
					case 2:
						convertirDecHex();
						break;
					case 3:
						sumaBinarios();
						break;
					case 4:
						vista.mostrarMensaje("Gracias por usar el programa.");
						break;
					default:
						vista.mostrarMensaje("Opcion incorrecta.");
						break;
				}	
			}while(opcion!=4);
		}catch (InputMismatchException e) {
			vista.mostrarMensaje("Debe ingresar un numero valido.");
		}
	}
	
	public void convertirDecBin() {
		vista.mostrarMensaje("Ingrese numero decimal: ");
		n = vista.leerDato();
		if (n >= 0) {
			vista.mostrarMensaje("El numero binario es: "+dbin.decBin(n));
		}else {
			vista.mostrarMensaje("Debe ingresar un numero positivo");
		}
		
	}
	
	public void convertirDecHex() {
		vista.mostrarMensaje("Ingrese numero decimal: ");
		n = vista.leerDato();
		if (n >= 0) {
			vista.mostrarMensaje("El numero hexadecimal es: "+dhex.decHex(n));
		} else {
			vista.mostrarMensaje("Debe ingresar un numero positivo");
		}
	}
	
	public void sumaBinarios() {
		vista.mostrarMensaje("Ingrese primer numero binario: ");
		b1 = vista.leerDato();
		vista.mostrarMensaje("Ingrese otro numero binario: ");
		b2 = vista.leerDato();
		if (comprobarBinario(b1) == true && comprobarBinario(b2)==true) {
			vista.mostrarMensaje("La suma de binarios es: "+bsum.sumaBin(b1, b2));
		}else {
			vista.mostrarMensaje("Ambos numeros deben ser binarios. (0 y 1)");
		}
	}
	
	public boolean comprobarBinario(long num) {
		while (num!=0) {
			if (num%10>1) {
				return false;
			}
			num = num / 10;
		}
		return true;
	} 

}
