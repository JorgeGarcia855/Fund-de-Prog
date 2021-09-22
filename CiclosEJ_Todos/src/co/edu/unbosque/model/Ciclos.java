package co.edu.unbosque.model;

public class Ciclos {
	
	private int num1, num2;
	
	public Ciclos() {
		num1 = 0;
		num2 = 0;
	}
	
	public String ejercicio4() { // Punto 1.
		String resul = "";
		int x = num1;
		while(x < (num2-1)) {
			x= x+1;
			resul = resul+ x+"\n";
		}
		return resul;
	}
	
	public String ejercicio9() { // Punto 2.
		String resul = "";
		int x = 25;
		x=x+1;
		while(x<205) {
			resul = resul+"\n"+x;
			x = x+10;
		}
		return resul;
	}
	
	public String ejercicio14() { // Punto 3.
		String resul = "";
		int contador = 1;
		int x = 0;
		int y = 1;
		while(contador <=20) {
			x = y*3;
			resul = resul+"\n"+x;
			y++;
			contador++;
		}
		
		return resul;
	}
	
	public boolean ejercicio19() { // Punto 4.
		boolean resul = true;
		for(int i = 2; i < num1; i++) {
			int residuo = num1 % i;
			if(residuo == 0) {
				resul = false;
				i = num1;
			}
		}
		return resul;
	}
	
	public String ejercicio24() { // Punto 5.
		String resul ="";
		int res = 0;
		int acum = 0;
		while(num1>0) {
			res =num1%10;	
			if(res%2==0) {
				acum = acum + res;
			}
			num1 = num1/10;
		}
		resul = ""+acum;
		return resul;
	}
	
	public int ejercicio29() { // Punto 6. fixed
		@SuppressWarnings("unused")
		int res = 0;
		int resul = 0;
		while(num1>0) {
			res =num1%10;
			num1 = num1/10;
			resul = num1;
			if(resul<10) {
				break;
			}
		}
		return resul;
	}
	
	public String ejercicio34() { // Punto 7.
		String resul = "";
		int x = 0;
		int y = 10;
		while(y>0) {
			x = x+1;
			resul = resul +"\n"+x;
			y--;
		}
		return resul;
	}
	
	public String ejercicio39() { // Punto 8.
		String resul = "";
		int x = 0;
		int y = 1;
		int ac = 0;
		while(ac<=20000) {
			resul =resul+"\n"+x;
			ac=x+y;
			x=y;
			y=ac;
		}
		return resul;
	}
	
	public String ejercicio44() { // Punto 9.
		String resul = "";
		long fact = 1;
		long contador = 1;
		while(contador<=num1) {
			fact = fact * contador;
			contador = contador + 1;
		}
		resul = resul + fact;
		return resul;
	}
	
	public String ejercicio49() { // Punto 10.
		String resul = "";
		int j = 0;
		for(int i = 1; i <=3; i++) {
			for(int b = 1; b<=3;b++) {
				j++;
				resul = resul +"\n"+(j+"  " +i+"  "+b);
			}
		}
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
