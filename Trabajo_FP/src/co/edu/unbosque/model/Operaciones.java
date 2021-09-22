package co.edu.unbosque.model;

public class Operaciones {
	
	private int num;
	private String texto;
	
	public Operaciones(){
		num = 0;
		texto = "";
	}
	
	public String fibonacci(Operaciones a) { // Serie de Fibonacci de un numero
		String resul = "";
		int x = 0;
		int y = 1;
		int ac = 0;
		if(a.num>=0)
			while(ac<=a.num) {
				resul =resul+x+"\n";
				ac=x+y;
				x=y;
				y=ac;
			}
		else {
			resul = "No funciona con numeros negativos.";
		}
		return resul;
	}
	
	public String contadorDivisores(Operaciones b) { // Contador de divisores de un numero
		String resul = "";
		if(b.num>0) {
			for(int i = 1; i <= b.num; i++) {
				int residuo = b.num % i;
				if(residuo == 0) {
					resul = resul + " "+i+"\n";
				}
			}
		}else {
			resul = "Valor invalido.";
		}
		return resul;
	}
	
	public int contadorEspacios(Operaciones c) { //Contador de espacios en blanco de un texto
		int espacios = 0;
		for(int i = 0; i < c.texto.length();i++) {
			if(c.texto.charAt(i)== ' ') {
				espacios++;
			}
		}
		return espacios;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
