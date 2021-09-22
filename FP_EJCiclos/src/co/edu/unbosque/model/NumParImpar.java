package co.edu.unbosque.model;

public class NumParImpar {
	
	private int num;
	
	public NumParImpar() {
		num = 0;
	}
	
	public int contadorPar() {
		int n = num;
		int contador = 0;
		while(n != 0) {
			int d = n%10;
			n = n/10;
			if(d % 2 == 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public int contadorImpar() {
		int n = num;
		int contador = 0;
		while(n != 0) {
			int d = n%10;
			n = n/10;
			if(d % 2 == 1) {
				contador++;
			}
		}
		return contador;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	

}
