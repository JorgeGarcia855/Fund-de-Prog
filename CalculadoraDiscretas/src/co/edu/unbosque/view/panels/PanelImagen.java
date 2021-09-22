package co.edu.unbosque.view.panels;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelImagen extends JPanel{
	
	private ImageIcon im;
	
	public PanelImagen() {
		// TODO Auto-generated constructor stub
	}
	
	public void paint(Graphics g) {
		Dimension tam = getSize();
		im = new ImageIcon(getClass().getResource("/Imagen/Imagen Calculadora.png"));
		g.drawImage(im.getImage(), 0, 0, tam.width, tam.height, null);
		setOpaque(false);
		super.paint(g);
	}

	public ImageIcon getIm() {
		return im;
	}

	public void setIm(ImageIcon im) {
		this.im = im;
	}

}
