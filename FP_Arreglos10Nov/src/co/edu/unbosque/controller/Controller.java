package co.edu.unbosque.controller;

import co.edu.unbosque.model.AgendaDeContactos;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.view.ViewVentana;

public class Controller {

	private final ViewVentana vista;
    private AgendaDeContactos agenda;
	
	public Controller() {
		vista = new ViewVentana();
		funcionar();
	}
	
	public void funcionar() {
		agenda = new AgendaDeContactos();
		menu();
	}

	public void menu() {
		int opcion;
		
		do {
			opcion = Integer.parseInt(vista.leerDato("""
                    Seleccione:

                    1. Agregar Contactos
                    2. Eliminar Contacto
                    3. Ver Directorio
                    4. Modificar datos
                    5. Salir

                    Opción:"""));
			
			switch (opcion) {
				case 1 -> {
                    int num;
                    num = Integer.parseInt(vista.leerDato("¿Cuantos contactos quiere agregar?"));
                    if (num > 0) {
                        for (int i = 0; i < num; i++) {
                            ingresarPersona();
                        }
                    } else {
                        vista.mostrarInfo("Ingrese un número positivo", "error");
                    }
                }
				case 2 ->{
                    borrarPersona();
                    vista.mostrarInfo(agenda.verDirectorio(), "informativo");
                }
                case 3 ->{
                    if (agenda.tamDirectorio()==0) {
                        vista.mostrarInfo("Agenda vacía, por favor ingrese un contacto", "informativo");
                    }else {
                        vista.mostrarInfo(agenda.verDirectorio(), "informativo");
                    }
                }
                case 4 ->{
                    modificarPersona();
                    vista.mostrarInfo(agenda.verDirectorio(), "informativo");
                }
				case 5 -> vista.mostrarInfo("Hasta pronto", "informativo");
				default -> vista.mostrarInfo("Sea Serio, OPCIÓN INVÁLIDA", "error");
			}
		} while (opcion!=5);
	}
	
	public void ingresarPersona() {
		
		String aux_correo;
		long aux_tel = 0;
		int aux_edad = 0;
		boolean error;
		String aux_nombre = vista.leerDato("Digite Nombre: ");

		do {
			try {
				aux_tel = Long.parseLong(vista.leerDato("Digite telefono: "));
				error=false;
			} catch (NumberFormatException e) {
				error=true;
			}
		} while (error);
		
		do {
			try {
				aux_edad = Integer.parseInt(vista.leerDato("Digite edad: "));
				error=false;
			} catch (NumberFormatException e) {
				error=true;
			}
		} while (error);
		
		do {
			aux_correo = vista.leerDato("Digite Correo: ");
			error = comprobarCorreo(aux_correo);
		} while (!error);

        Persona persona_aux = new Persona(aux_nombre, aux_tel, aux_edad, aux_correo);
		if(agenda.agregarPersona(persona_aux)) {
			vista.mostrarInfo("La persona fué agregada satisfactoriamente", "informativo");
			vista.mostrarInfo(agenda.getPosicionDirectorio(agenda.tamDirectorio()-1).toString(), "informativo");
		}else{
			vista.mostrarInfo("La persona no se agregó", "error");
		}
		
	}
	
	public void borrarPersona() {
		int pos = Integer.parseInt(vista.leerDato(agenda.verDirectorio()+"\n\nIngrese el número del contacto a eliminar"));
		pos = pos-1;
		agenda.borrarContacto(pos);
	}
	
	public void modificarPersona() {
		String aux_correo;
		long aux_tel = 0;
		int aux_edad = 0;
		boolean error;
		int pos = Integer.parseInt(vista.leerDato(agenda.verDirectorio()+"\n\nIngrese el número del contacto a modificar"));
		pos = pos-1;
		int campo;
		do {
			campo = Integer.parseInt(vista.leerDato("Los datos del contacto a modificar son: "
					+"\n"+agenda.getPosicionDirectorio(pos)
					+"\n\nCampo a modificar"
					+"\n1. Nombre"
					+"\n2. Telefono"
					+"\n3. Edad"
					+"\n4. Correo"
					+"\n\nOpción: "));
		}while(campo<1 || campo>4);
		
		if (campo == 1) {
			String aux_nombre = vista.leerDato("Digite Nombre: ");
			agenda.getPosicionDirectorio(pos).setNombre(aux_nombre);
		}else if (campo == 2){
			do {
				try {
					aux_tel = Long.parseLong(vista.leerDato("Digite telefono: "));
					error=false;
				} catch (NumberFormatException e) {
					error=true;
				}
			} while (error);
			agenda.getPosicionDirectorio(pos).setTelefono(aux_tel);
		}else if (campo == 3) {
			do {
				try {
					aux_edad = Integer.parseInt(vista.leerDato("Digite edad: "));
					error=false;
				} catch (NumberFormatException e) {
					error=true;
				}
			} while (error);
			agenda.getPosicionDirectorio(pos).setEdad(aux_edad);
		}else {
			do {
				aux_correo = vista.leerDato("Digite Correo: ");
				error = comprobarCorreo(aux_correo);
			} while (!error);
			agenda.getPosicionDirectorio(pos).setCorreo(aux_correo);
		}

	}
	
	public boolean comprobarCorreo(String correo) {
		int contador = 0;
		boolean comprobar = false;
		for(int i=0; i<correo.length(); i++) {
			if(correo.charAt(i) == '@' ) {
				contador++;
			}
		}
		if (contador!=1) {
			vista.mostrarInfo("Ingrese un correo valido", "error");
		}else{
			comprobar =true;
		}
		return comprobar;
	}
	
}
