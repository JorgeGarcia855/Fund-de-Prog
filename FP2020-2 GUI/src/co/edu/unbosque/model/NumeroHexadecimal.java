package co.edu.unbosque.model;

public class NumeroHexadecimal  {
	
	private String numero;
	
	public NumeroHexadecimal() {
		numero = "";
	}
	
	public double conversionHexDec() {
		double r = 0;
		int aux = 0;
		int cont = 0;
		for(int i = numero.length()-1; i>=0; i--) {
			char simbolo = numero.charAt(i);
			if ((int)simbolo>=65 && (int)simbolo<=70) {
				aux = (int)simbolo - 55;
			}else if ((int)simbolo>=48 && (int)simbolo<=57) {
				aux = simbolo - '0';
			}
			r = r + (aux*Math.pow(16,cont));
			cont++;
		}
		return r;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	

	
	
}
