package co.edu.unbosque.model;

import java.util.Arrays;

public class Arreglos {
	
	private int num[];
	private int tam;
	
	public Arreglos(int t) {
		tam = t;
		num = new int[tam];
	}
	
	public void asignarValorPos(int pos, int valor) {
		num[pos] = valor;
	}
	
	public void inicializarArreglo() {
		for (int i = 0; i < tam; i++) {
			num[i]= 0;
		}
	}
	
	public String ejercicio4() {
		int[] fib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
		String resul = "";
		for (int i = 0; i < fib.length; i++) {
			resul = resul+fib[i]+",";
		}
		return resul;
	}
	
	public String ejercicio9() {
		String resul = "";
		@SuppressWarnings("unused")
		int cont;
		int max = Arrays.stream(num).max().getAsInt();
		for (int i = 0; i < tam; i++) {
			cont = 0;
			for (int j = 0; j < tam; j++) {
				if (num[i]==num[j] && i!=j && num[i] == max) {
					resul = resul+num[i]+" ";
				}
			}
		}
		return resul;
	}

	@Override
	public String toString() {
		return "Arreglos [num=" + Arrays.toString(num) + ", tam=" + tam + "]";
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	
	
	
}
