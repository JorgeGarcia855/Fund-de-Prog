package co.edu.unbosque.model;

public class TablaMutiplicar {
	
	public int numero;
	
	public TablaMutiplicar() {
		numero = 0;
	}
	
	public String hacerTablaConCiclos(int n) {
		String resul = "";
		
		for(int i = 0; i<=n ; i++) {
			resul = resul + numero +" * "+i+ "=" +(numero*i)+ "\n";
		}
		
		return resul;
	}

}
