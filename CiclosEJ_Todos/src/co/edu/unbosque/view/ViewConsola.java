package co.edu.unbosque.view;

import java.util.Scanner;

public class ViewConsola {
	
	public Scanner leer;
			
		public ViewConsola(){
			leer = new Scanner(System.in);
		}
			
		public void mostrarMensaje(String mensaje) {
			System.out.println(mensaje);
		}
			
		public int leerDato() {
			int dato = 0;
			dato = leer.nextInt();
			return dato;
		}
		
		public String leerString() {
			String stg ="";
			stg = leer.next();
			return stg;
		}
	}



