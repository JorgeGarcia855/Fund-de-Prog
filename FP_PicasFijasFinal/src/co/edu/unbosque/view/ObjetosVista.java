package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ObjetosVista extends JPanel{
	
	public void button(JButton boton) {
		
	}
	
	public void titulos(JLabel label, String titulo, String fonttype, int fontstyle,int fontsize, int x, int y, int w, int h) {
		label = new JLabel(titulo);
		label.setFont(new Font(fonttype, fontstyle, fontsize));
		label.setBounds(x, y, w, h);
		add(label);	
	}


}
