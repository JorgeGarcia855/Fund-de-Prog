package co.edu.unbosque.view;
import javax.swing.JOptionPane;

public class ViewVentana {
	public ViewVentana() {
		
	}
	
	public int leerDato() {
		String aux = JOptionPane.showInputDialog("Digite Estrato: ");
		String aux2 = JOptionPane.showInputDialog("Digite Metros Cubicos: ");
		int estrato = Integer.parseInt(aux + aux2);
		
		return estrato;
		
	}
	
		
	
	public void mostrarInformacion(String texto ) {
		JOptionPane.showMessageDialog(null, texto);
	}

}
