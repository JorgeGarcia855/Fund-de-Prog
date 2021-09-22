package co.edu.unbosque.model;

public class Ciclos {
	
	private int num;
	
	public Ciclos() {
		num = 0;
	}
	
	public String ejercicio29() {
		int res = 0;
		while(num>0) {
			res =num%10;
			num = num/10;
			if(num<10) {
				break;
			}
		}
		System.out.println("El primer digito del numero es: "+num);
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
