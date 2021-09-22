package co.edu.unbosque.model;

public class Ciclos {
	
	private int num1, num2;
	
	public Ciclos() {
		num1 = 0;
		num2 = 0;
	}
	
	public String ejercicio4() {
		int x = num1;
		while(x < (num2-1)) {
			x= x+1;
			System.out.println(x);
		}
		String resul = "";
		return resul;
	}
	
	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum() {
		return num1;
	}

	public void setNum(int num1) {
		this.num1 = num1;
	}
	
}
