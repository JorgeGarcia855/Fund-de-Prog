package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame{
	
	private PanelSeleccion pseleccion;
	private PanelResultados presultados;
	private PanelDatosBlanco pblanco;
	private PanelDatos pfibo;
	private PanelDatos pEspacios;
	private PanelDatos phexa;

	public VentanaPrincipal() {
		setTitle("Ventana Principal");
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		
		pseleccion = new PanelSeleccion();
		getContentPane().add(pseleccion, BorderLayout.NORTH);
		
		presultados = new PanelResultados();
		getContentPane().add(presultados, BorderLayout.CENTER);
		
		pblanco = new PanelDatosBlanco();
		getContentPane().add(pblanco, BorderLayout.WEST);
		
		pfibo = new PanelDatos();
				
		pEspacios = new PanelDatos();
		pEspacios.getEtnumero().setText("Frase:");
		pEspacios.getBtOperacion().setText("Buscar");
		pEspacios.getBtOperacion().setActionCommand("BUSCAR");
		
		phexa = new PanelDatos();
		phexa.getEtnumero().setText("Introdusca hexadecimal:");
		phexa.getBtOperacion().setText("Convertir");
		phexa.getBtOperacion().setActionCommand("CONVERTIR");
		
		
	}

	public PanelSeleccion getPseleccion() {
		return pseleccion;
	}

	public void setPseleccion(PanelSeleccion pseleccion) {
		this.pseleccion = pseleccion;
	}

	public PanelResultados getPresultados() {
		return presultados;
	}

	public void setPresultados(PanelResultados presultados) {
		this.presultados = presultados;
	}

	public PanelDatosBlanco getPblanco() {
		return pblanco;
	}

	public void setPblanco(PanelDatosBlanco pblanco) {
		this.pblanco = pblanco;
	}

	public PanelDatos getPfibo() {
		return pfibo;
	}

	public void setPfibo(PanelDatos pfibo) {
		this.pfibo = pfibo;
	}

	public PanelDatos getpEspacios() {
		return pEspacios;
	}

	public void setpEspacios(PanelDatos pEspacios) {
		this.pEspacios = pEspacios;
	}

	public PanelDatos getPhexa() {
		return phexa;
	}

	public void setPhexa(PanelDatos phexa) {
		this.phexa = phexa;
	}
	
	
	
}
