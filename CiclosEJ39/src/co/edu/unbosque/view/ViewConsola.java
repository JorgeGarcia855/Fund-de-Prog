package co.edu.unbosque.view;

import java.util.Scanner;

public class ViewConsola {

	private static final Scanner leer = new Scanner(System.in);

	public int leerEntero() {
        return leer.nextInt();
    }
}
