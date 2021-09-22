package co.edu.unbosque.model;

public class Numero {
	
	private int n;
	
	public Numero() {
		n = 0;
	}
	
	public String generarSerieFibo() {
		int a = 0;
		int b = 1;
		String r = "";
		for(int i = 0; i< n; i++) {
			a = b + a;
			b = a - b;
			r = r + b + "\n";
		}
		return r;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
}
