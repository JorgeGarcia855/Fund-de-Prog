package co.edu.unbosque.controller;
import co.edu.unbosque.view.ViewVentana;
import co.edu.unbosque.model.GasNatural;

public class Controller {
	public ViewVentana vista;
	public GasNatural gas_natural;
	
	public Controller() {
		vista = new ViewVentana();
		gas_natural = new GasNatural();
		funcionar();
	} 
	
	public void funcionar() {
		gas_natural.estsoc = vista.leerDato();
		System.out.println(gas_natural.estsoc);
		gas_natural.mtsc = vista.leerDato();
		System.out.println(gas_natural.mtsc);
		if(gas_natural.estsoc>0 && gas_natural.mtsc>0) {
			String estsoc = gas_natural.gasFuncional();
			String mtsc = gas_natural.gasFuncional();
			vista.mostrarInformacion(estsoc);
			vista.mostrarInformacion(mtsc);
		}else 
			vista.mostrarInformacion("Valor Invalido");
		}
	
	   
	   
	  
}
