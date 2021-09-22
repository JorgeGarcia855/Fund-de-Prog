package co.edu.unbosque.model;

/**
 * Clase Operaciones
 * 
 * Clase del modelo que consta de 5 m�todos, el constructor, uno de tipo String, dos de tipo entero, y uno de tipo boolean.
 * 
 * @author David Real
 * @author David Mill�n
 * @author Jorge Garc�a
 * @version 1.0
 * 
 */

public class Operaciones {
	/**
	 * M�todo Contructor de la clase Operaciones
	 */
	public Operaciones() {
	}
	
	/**
	 * M�todo que genera un n�mero aleatorio de un tama�o pasado por par�metro
	 * 
	 * @param tamNumero Objeto de tipo Int
	 * @return Un String que contiene el n�mero generado
	 */
	public String Maquina(int tamNumero) {
		String resul="";
		double random = Math.pow(10, tamNumero-1)+Math.random()*((Math.pow(10, tamNumero)-1)-Math.pow(10, tamNumero-1));
		int numero = (int)random;
		resul = String.valueOf(numero);
		return resul;
	}
	
	/**
	 * M�todo que compara dos cadenas de texto e identifica si tienen caracteres iguales en una misma posici�n
	 * 
	 * @param numero Objeto de tipo String
	 * @param numAdiv Objeto de tipo String
	 * @return Un entero de el n�mero de caracteres iguales en una misma posici�n
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
	 * M�todo que compara dos cadenas de caracteres e identifica si tienen caracteres iguales s�lo si no est�n en la misma posici�n
	 * 
	 * @param numero Un objeto de tipo String
	 * @param numAdiv Un objeto de tipo String
	 * @return Un entero con el n�mero n�mero de caracteres iguales en diferente posici�n
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
	 * M�todo que verifica si existen caracteres repetidos en una cadena de texto
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
	 * M�todo que compara dos cadenas de texto, identifica si tienen caracteres iguales en diferente posici�n y los devuelve en una cadena de texto
	 * 
	 * @param numero Un objeto de tipo String
	 * @param numAdiv Un objeto de tipo String
	 * @return Una cadena de caracteres con los caracteres iguales en diferente posici�n
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
	 * M�todo que compara dos cadenas de texto, identifica si tienen caracteres iguales en una misma posici�n y los devuelve en una cadena de texto
	 * 
	 * @param numero Un objeto de tipo String
	 * @param numAdiv Un objeto de tipo String
	 * @return Una cadena de caracteres con los caracteres iguales en la misma posici�n
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

