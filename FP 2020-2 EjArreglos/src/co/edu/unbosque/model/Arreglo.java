package co.edu.unbosque.model;

public class Arreglo {
	
	private int[] numeros;
	private int tam;
	//private int CantNumIngresados;
	
	public Arreglo(int t) {
		tam = t;
		//CantNumIngresados = 0;
		numeros = new int [tam];
		inicializarArreglo();
	}
	
	public void asignarValorPos(int pos, int valor) {
		numeros[pos] = valor;
	}
	
	public void inicializarArreglo() {
		for (int i = 0; i < tam; i++) {
			numeros[i]= 0;
		}
	}
	
	public String devolverArreglo() {
		String contenido = "";
		for (int i = 0; i < tam; i++) {
			contenido = contenido.concat(numeros[i]+" ");
		}
		return contenido;
	}

	@Override
	public String toString() {
		String imprimir;
		imprimir = "Tamaño del arreglo: "+tam+"\n";
		imprimir = imprimir.concat("Su contenido es:\n");
		for (int i = 0; i < tam; i++) {
			imprimir = imprimir.concat("Arreglo["+i+"] = "+numeros[i]+"\n");
		}
		return imprimir;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	/*public int getCantNumIngresados() {
		return CantNumIngresados;
	}

	public void setCantNumIngresados(int cantNumIngresados) {
		CantNumIngresados = cantNumIngresados;
	}*/
	
	
}
