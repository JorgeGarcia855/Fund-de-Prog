package co.edu.unbosque.model;



public class Ciclos {
	
	private int num;
	
	public Ciclos() {
		num = 0;
	}
	
	public String ejercicio44() {
		long fact = 1;
		long contador = 1;
		while(contador<=num) {
			fact = fact * contador;
			contador = contador + 1;
		}
		System.out.println("El valor factorial de "+num+" es "+fact);
		String resul = "";
		return resul;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


}
