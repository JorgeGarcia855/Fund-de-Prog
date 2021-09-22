package co.edu.unbosque.model;

public class Euclides {
	
	private int num, num2;
	
	public Euclides() {
		num = 0;
		num2 = 0;
	}
	
	public String algoritmoMCD() {
		String resul = "";
		int a = num;
		int b = num2;
		int c, r, cal = 0;
		while(a%b>0) {
			c= a/b;
			r= a%b;
			cal = b*c+r;
			System.out.println(a+" = "+b+" * "+c+" + "+r);
			a = b;
			c = cal;
			b=r;
		}
		resul = ""+b;
		return resul;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}


}
