package co.edu.unbosque.model;

public class Frase {
	
	private String frase;
	
	public Frase() {
		frase = "";
	}
	
	public int contarEspacios() {
		int c = 0;
		for(int i = 0;i < frase.length(); i++) {
			if(frase.charAt(i)== ' ') {
				c++;
			}
		}
		return c;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	
}
