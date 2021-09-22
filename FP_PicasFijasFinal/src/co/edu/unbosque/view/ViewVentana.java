package co.edu.unbosque.view;
/**
* Clase ViewVentana
* 
* Clase de la vista que cuenta con 3 metodos, el constructor, otro de tipo void y uno tipo int, sin embargo el contructor esta vacio. 
* 
* @author David Real
* @author David Millán
* @author Jorge García
* @version 1.0
* 
*/
import javax.swing.JOptionPane;

public class ViewVentana{
	/**
	 * Método Contructor de la clase ViewVentana
	 */
	public ViewVentana() {
		
	}
	/**
	 * Método que se encarga de mostrar un mensaje de tipo error o informativo.
	 * 
	 * @param mensaje Objeto de tipo String
	 * @param tipo Objeto de tipo String
	 */
	public void mostrarMensaje(String mensaje, String tipo) {
		if(tipo.equals("informativo")) {
			JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
		}else if(tipo.equals("error")) {
			JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	/**
	 * Método que se encarga de leer un dato tipo string y convertirlo a int
	 * 
	 * @param mensaje Objeto de tipo String
	 * @return Un int que contiene el dado
	 */
	public int leerDato(String mensaje) {
		String aux = JOptionPane.showInputDialog(null,mensaje,"Ingrese",JOptionPane.QUESTION_MESSAGE);
		int dato = Integer.parseInt(aux);
		return dato;
	}
}