package co.edu.unbosque.view;
import javax.swing.JOptionPane;

public class ViewVentana {
	public ViewVentana() {
		
	}
	
	public int leerDato() {
		String aux = JOptionPane.showInputDialog("Digite numero serial: ");
		int serial = Integer.parseInt(aux);
		return serial;
	}
	
	public void mostrarInformacion(String texto ) {
		JOptionPane.showMessageDialog(null, texto);
	}

}
