package co.edu.unbosque.model;



public class Ciclos {
	
	private int num;
	
	public Ciclos() {
		num = 0;
	}
	
	public String ejercicio24() {
		int res = 0;
		int acum = 0;
		while(num>0) {
			res =num%10;	
			if(res%2==0) {
				acum = acum + res;
			}
			num = num/10;
		}
		System.out.println("La suma de sus digitos pares es: "+acum);
		String resul ="";
		return resul;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


}
