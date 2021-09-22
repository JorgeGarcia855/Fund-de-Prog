package co.edu.unbosque.controller;
import co.edu.unbosque.view.ViewVentana;
import co.edu.unbosque.model.SerialAuto;

public class Controller {
	public ViewVentana vista;
	public SerialAuto serial_auto;
	
	public Controller() {
		vista = new ViewVentana();
		serial_auto = new SerialAuto();
		funcionar();
	} 
	
	public void funcionar() {
		serial_auto.serial = vista.leerDato();
		System.out.println(serial_auto.serial);
		if(serial_auto.serial>0) {
			String serial = serial_auto.serialFuncional();
			vista.mostrarInformacion(serial);
		}else {
			vista.mostrarInformacion("Ingresaste un numero incorrecto");
		}
	}
	
}
