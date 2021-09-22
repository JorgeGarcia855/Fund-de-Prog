package co.edu.unbosque.controller;



public class Controller {

	public Controller() {
		funcionar();
	}

	public void funcionar() {

		System.out.println(sumaBin(1001001, 100111));
	}

	public String sumaBin(long bin1, long bin2) {
		String resul = "";
		int i = 0;
		int valor = 0;
		int[] salida = new int[10];
		while (bin1 != 0 || bin2 != 0) {
			salida[i++] = (int) (valor + ((bin1 % 10) + (bin2 % 10)) % 2);
			// System.out.println(salida[i]);
			valor = (int) (((bin1 % 10) + (bin2 % 10) + valor) / 2);
			// System.out.println(valor);
			bin1 = bin1 / 10;
			System.out.println(bin1);
			bin2 = bin2 / 10;
			System.out.println(bin2);
		}
		if (valor != 0) {
			salida[i++] = valor;
			// System.out.println(salida);
		}
		--i;
		while (i >= 0) {
			resul = resul + salida[i--];
		}
		return resul;
	}

}
