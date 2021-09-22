package co.edu.unbosque.model;

public class Numero {

	public static int contarCifras(int num) {
		int contador = 0;
		int n = num;
		while(n != 0) {
			n = n/10;
			contador++;
		}
		return contador;
	}
	
	public static boolean esPrimo(int num) {
		int contador = 0;
		for(int i = 1; i <= num; i++) {
			int residuo = num % i;
			if(residuo == 0) {
				contador++;
			}
		}
        return contador == 2;
	}
	
	public static boolean esPrimo2(int num) {
		boolean resul = true;
		for(int i = 2; i < num; i++) {
			int residuo = num % i;
			if(residuo == 0) {
				resul = false;
				i = num;
			}
		}
		return resul;
	}
	
	public static String divisores(int num) {
		StringBuilder resul = new StringBuilder();
		if(num>0) {
			for(int i = 1; i <= num; i++) {
				int residuo = num % i;
				if(residuo == 0) {
					resul.append(" ").append(i).append("\n");
				}
			}
		}else {
			resul = new StringBuilder("No funciona con numeros negativos.");
		}
		return resul.toString();
	}
	
	public static int numeroDivisores(int num) {
		int contador = 0;
		for(int i = 1; i <= num; i++) {
			int residuo = num % i;
			if(residuo == 0) {
				contador++;
			}
		}
		return contador;
	}

}
