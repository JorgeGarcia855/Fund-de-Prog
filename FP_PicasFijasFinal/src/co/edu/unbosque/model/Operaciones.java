package co.edu.unbosque.model;

/**
 * Clase Operaciones
 * 
 * Clase del modelo que consta de 5 métodos, el constructor, uno de tipo String, dos de tipo entero, y uno de tipo boolean.
 * 
 * @author David Real
 * @author David Millán
 * @author Jorge García
 * @version 1.0
 * 
 */

public class Operaciones {
	/**
	 * Método Contructor de la clase Operaciones
	 */
	public Operaciones() {
	}
	
	/**
	 * Método que genera un número aleatorio de un tamaño pasado por parámetro
	 * 
	 * @param tamNumero Objeto de tipo Int
	 * @return Un String que contiene el número generado
	 */
	public String Maquina(int tamNumero) {
		String resul="";
		double random = Math.pow(10, tamNumero-1)+Math.random()*((Math.pow(10, tamNumero)-1)-Math.pow(10, tamNumero-1));
		int numero = (int)random;
		resul = String.valueOf(numero);
		return resul;
	}
	
	/**
	 * Método que compara dos cadenas de texto e identifica si tienen caracteres iguales en una misma posición
	 * 
	 * @param numero Objeto de tipo String
	 * @param numAdiv Objeto de tipo String
	 * @return Un entero de el número de caracteres iguales en una misma posición
	 */
	public int fijas(String numero, String numAdiv) {
		int resul =0;
		for (int i = 0; i < numero.length(); i++) {
			if (numAdiv.charAt(i)==numero.charAt(i)) {
				resul++;
			}
		}
		return resul;
	}
	
	/**
	 * Método que compara dos cadenas de caracteres e identifica si tienen caracteres iguales sólo si no están en la misma posición
	 * 
	 * @param numero Un objeto de tipo String
	 * @param numAdiv Un objeto de tipo String
	 * @return Un entero con el número número de caracteres iguales en diferente posición
	 */
	public int picas(String numero, String numAdiv) {
		int resul =0;
		for (int i = 0; i < numero.length(); i++) {
			for (int j = 0; j < numero.length(); j++) {
				if (i!=j && numAdiv.charAt(i)==numero.charAt(j)) {
					resul++;
				}
			}
		}
		return resul;
	}
	
	/**
	 * Método que verifica si existen caracteres repetidos en una cadena de texto
	 * 
	 * @param num Objeto de tipo String
	 * @return <ul>
	 * 			<li>True:si la cadena de texto tiene caracteres repetidos
	 * 			<li>False:si la cadena de texto no tiene caracteres repetidos
	 * 		   </ul>
	 */
	public boolean VerificarRepetidos(String num) {
		boolean resul=false;
		for (int i = 0; i < num.length(); i++) {
			for (int j = 1; j < num.length(); j++) {
				if(i!=j && num.charAt(i)==num.charAt(j)) {
					resul=true;
					j=num.length();
					i=num.length();
				}
			}
		}
		return resul;
	}	
	/**
	 * Método que compara dos cadenas de texto, identifica si tienen caracteres iguales en diferente posición y los devuelve en una cadena de texto
	 * 
	 * @param numero Un objeto de tipo String
	 * @param numAdiv Un objeto de tipo String
	 * @return Una cadena de caracteres con los caracteres iguales en diferente posición
	 */
	public String ayudapicas(String numero, String numAdiv) {
		String resul ="";
		for (int i = 0; i < numero.length(); i++) {
			for (int j = 0; j < numero.length(); j++) {
				if (i!=j && numAdiv.charAt(i)==numero.charAt(j)) {
					resul = resul +""+ numero.charAt(j)+" | ";
				}
			}
		}
		return resul;
	}
	/**
	 * Método que compara dos cadenas de texto, identifica si tienen caracteres iguales en una misma posición y los devuelve en una cadena de texto
	 * 
	 * @param numero Un objeto de tipo String
	 * @param numAdiv Un objeto de tipo String
	 * @return Una cadena de caracteres con los caracteres iguales en la misma posición
	 */
	public String ayudafijas(String numero, String numAdiv) {
		String resul ="";
		for (int i = 0; i < numero.length(); i++) {
			if (numAdiv.charAt(i)==numero.charAt(i)) {
				resul = resul +""+ numero.charAt(i)+" | ";
			}
		}
		return resul;
	}
	
}

