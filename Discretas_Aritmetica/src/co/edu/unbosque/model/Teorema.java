package co.edu.unbosque.model;

public class Teorema {
	
private int num;
	
	public Teorema() {
		num = 0;
	}
	
	public int contadorDivisores() {
		
		int x = num;
		int c = 0;
		int d = 2;
		int count = 0;
		int suma = 1;
		while(x>0) {
			if (x%d==0) {
				c = x/d;
				x = c;
				count++;
			}else {
				d++;
				suma = suma*(count+1);
				count = 0;
				if (x==1) {
					break;
				}
			}
		}
		return suma;
		
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
