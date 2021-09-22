package co.edu.unbosque.model;



public class Ciclos {
	
    private int num;
	
	public Ciclos() {
		num = 0;
	}
	
	public boolean ejercicio19() {
		boolean resul = true;
		for(int i = 2; i < num; i++) {
			int residuo = num % i;
			if(residuo == 0) {
				resul = false;
				i = num;
			}
		}
		return resul;
	}

	public int getNum( ) {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}



}
