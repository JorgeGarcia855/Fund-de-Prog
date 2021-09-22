package co.edu.unbosque.controller;

import co.edu.unbosque.model.AgendaContactos;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.view.ViewConsola;

public class Controller {
	
	private Persona persona_aux;
	private AgendaContactos agenda;
	private ViewConsola vista;

	public Controller() {
		vista = new ViewConsola();
		funcionar();
	}
	
	public void funcionar() {
		int tam = Integer.parseInt(vista.leerDato("Ingrese Tama�o del la agenda"));
		agenda = new AgendaContactos(tam);
		ingresarPersona();
		ingresarPersona();
		ingresarPersona();
		vista.mostrarMensaje(agenda.verDirectorio());
	}
	
	public void ingresarPersona() {
		String aux_nombre = vista.leerDato("Digite nombre: ");
		long aux_tel = Long.parseLong(vista.leerDato("Digite telefono: "));
		persona_aux = new Persona(aux_nombre, aux_tel);

		if (agenda.agregarPersona(persona_aux)) {
			vista.mostrarMensaje("La persona fue agregada");
			vista.mostrarMensaje(agenda.getPosicionDirectorio(agenda.getCantidad_ingresados()-1).toString());
		}else {
			vista.mostrarMensaje("La persona no fue agregada");
		}
	}
	
	
	
	
	
}

