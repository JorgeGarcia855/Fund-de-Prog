package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame{
	
	private PanelFibonacci pfibonacci;
	private PanelResulFibonacci prfibonacci;
	
	private PanelDivisores pdivisores;
	private PanelResulDivisores prdivisores;
	
	private PanelTexto ptexto;
	private PanelResulTexto prtexto;
	
	public VentanaPrincipal() {
		setTitle("Aplicación");
		setSize(1200, 660);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		pfibonacci = new PanelFibonacci();
		pfibonacci.setBounds(10,10,  350, 200);
		getContentPane().add(pfibonacci);
		
		prfibonacci = new PanelResulFibonacci();
		prfibonacci.setBounds(10, 210, 350, 400);
		getContentPane().add(prfibonacci);
		
		pdivisores = new PanelDivisores();
		pdivisores.setBounds(380, 10, 350, 200);
		getContentPane().add(pdivisores);
		
		prdivisores = new PanelResulDivisores();
		prdivisores.setBounds(380, 210, 350, 400);
		getContentPane().add(prdivisores);
		
		ptexto = new PanelTexto();
		ptexto.setBounds(750, 10, 425, 300);
		getContentPane().add(ptexto);
		
		prtexto = new PanelResulTexto();
		prtexto.setBounds(750, 310, 425, 300);
		getContentPane().add(prtexto);
	}

	public PanelFibonacci getPfibonacci() {
		return pfibonacci;
	}

	public void setPfibonacci(PanelFibonacci pfibonacci) {
		this.pfibonacci = pfibonacci;
	}

	public PanelResulFibonacci getPrfibonacci() {
		return prfibonacci;
	}

	public void setPrfibonacci(PanelResulFibonacci prfibonacci) {
		this.prfibonacci = prfibonacci;
	}

	public PanelDivisores getPdivisores() {
		return pdivisores;
	}

	public void setPdivisores(PanelDivisores pdivisores) {
		this.pdivisores = pdivisores;
	}

	public PanelResulDivisores getPrdivisores() {
		return prdivisores;
	}

	public void setPrdivisores(PanelResulDivisores prdivisores) {
		this.prdivisores = prdivisores;
	}

	public PanelTexto getPtexto() {
		return ptexto;
	}

	public void setPtexto(PanelTexto ptexto) {
		this.ptexto = ptexto;
	}

	public PanelResulTexto getPrtexto() {
		return prtexto;
	}

	public void setPrtexto(PanelResulTexto prtexto) {
		this.prtexto = prtexto;
	}
	
	

}
