package co.edu.unbosque.model;

public class Numero {
	
	private double num;
	
	public Numero() {
		num = 0.0;
	}
	
	public double sumar(Numero b) {
		return num + b.num;
	}
	
	public double restar(Numero b) {
		return num - b.num;
	}
	
	public double multiplicar(Numero b) {
		return num * b.num;
	}
	
	public double dividir(Numero b) {
		return num / b.num;
	}
	
	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}
	
	
}
