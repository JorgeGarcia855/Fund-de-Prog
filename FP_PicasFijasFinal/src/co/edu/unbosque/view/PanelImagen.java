package co.edu.unbosque.view;

/**
 * Clase PanelImagen. 
 * 
 * Clase de la vista que consta de 2 metodos el contructor y otro de tipo void, sin embargo el contructor esta vacio.
 * 
 * @author David Real
 * @author David Millán
 * @author Jorge García
 * @version 1.0
 * 
 */

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelImagen extends JPanel{
	/**
	 *  Objeto de ImageIcon
	 */
	private ImageIcon im;
	/**
	 * Método Contructor de la clase PanelImagen
	 */
	public PanelImagen() {
		
	}
	/**
	 * Método que se ejecuta cada vez que el JFrame debe ser redibujado.
	 * 
	 * @param g Objeto de tipo Graphics.
	 */
	public void paint (Graphics g) {
		Dimension tam = getSize();
		im =  new ImageIcon(getClass().getResource("/imagenes/PyF.png"));
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
