package co.edu.unbosque.controller;

import co.edu.unbosque.view.ViewVentana;
import co.edu.unbosque.model.Ciclos;

public class Controller {
	
	private ViewVentana vista;
	private Ciclos ciclos;
	
	public Controller() {
		vista = new ViewVentana();
		ciclos = new Ciclos();
		funcionar();
	}
	
	public void funcionar() {
		int opcion = 0;
		try {
			do {
				opcion = vista.leerDato("""
                        Seleccione uno de los ejercicios:\s

                        1. Numeros comprendidos entre dos enteros
                        2. Los numeros terminados en 6 entre 25 y 205
                        3. Los primeros 20 multiplos de 3
                        4. Determinar si un numero entero es primo
                        5. La suma de los digitos pares de un entero
                        6. Leer el primer digito de un entero
                        7. Generar los numeros del 1 al 10 con un ciclo que va de 10 a 1
                        8. Serie de Fibonacci que sobrepasa el numero 10000
                        9. Calcular el factorial de un numero
                        10. Ejercicio ciclos anidados
                        11. Salir""");

                switch (opcion) {
                    case 1 -> {
                        int n1 = vista.leerDato("Ingrese primer numero: ");
                        ciclos.setNum(n1);
                        int n2 = vista.leerDato("Ingrese segundo numero: ");
                        ciclos.setNum2(n2);
                        if (n1 < n2) {
                            vista.mostrarMensaje("Los numeros comprendidos entre " + ciclos.getNum() + " y " + ciclos.getNum2() + " son los siguientes: " + "\n" + ciclos.ejercicio4(), "informativo");
                        } else {
                            vista.mostrarMensaje("Ingresate valores incorrectos", "error");
                        }
                    }
                    case 2 -> vista.mostrarMensaje("Estamos mostrando los numeros comprendidos entre 25 y 205 terminados en 6: " + ciclos.ejercicio9(), "informativo");
                    case 3 -> vista.mostrarMensaje("Los multiplos son los siguientes: " + ciclos.ejercicio14(), "informativo");
                    case 4 -> {
                        int n3 = vista.leerDato("Ingrese numero: ");
                        ciclos.setNum(n3);
                        vista.mostrarMensaje("El numero " + ciclos.getNum() + " es primo? " + ciclos.ejercicio19(), "informativo");
                    }
                    case 5 -> {
                        int n4 = vista.leerDato("Ingrese numero: ");
                        ciclos.setNum(n4);
                        vista.mostrarMensaje("La suma de sus digitos pares es: " + ciclos.ejercicio24(), "informativo");
                    }
                    case 6 -> {
                        int n5 = vista.leerDato("Ingrese numero: ");
                        ciclos.setNum(n5);
                        vista.mostrarMensaje("El primer digito del numero es: " + ciclos.ejercicio29(), "informativo");
                    }
                    case 7 -> vista.mostrarMensaje("Se muestra el siguiente ciclo: " + ciclos.ejercicio34(), "informativo");
                    case 8 -> vista.mostrarMensaje("Se muestra una serie de Fibonacci: " + ciclos.ejercicio39(), "informativo");
                    case 9 -> {
                        int n6 = vista.leerDato("Ingrese numero: ");
                        ciclos.setNum(n6);
                        if (n6 > 0) {
                            ciclos.setNum(n6);
                            vista.mostrarMensaje("El valor factorial de " + ciclos.getNum() + " es: " + ciclos.ejercicio44(), "informativo");
                        } else {
                            vista.mostrarMensaje("No funciona con numeros negativos.", "error");
                        }
                    }
                    case 10 -> vista.mostrarMensaje("Se muestra el siguiente ciclo anidado: " + ciclos.ejercicio49(), "informativo");
                    case 11 -> vista.mostrarMensaje("Gracias por usar el programa", "informativo");
                    default -> vista.mostrarMensaje("Opcion invalida", "error");
                }
			}while(opcion!=11);
		}catch(Exception e) {
			vista.mostrarMensaje("Gracias por usar el programa", "informativo");
		}
	
	}
}
