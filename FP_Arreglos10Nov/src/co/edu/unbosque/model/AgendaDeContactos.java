package co.edu.unbosque.model;

import java.util.ArrayList;

public class AgendaDeContactos {

	private ArrayList <Persona> directorio;
	
	public AgendaDeContactos() {
		
		directorio = new ArrayList<> ();
	
	}
	
	public boolean agregarPersona(Persona x) {
		if(x!=null) {
			directorio.add(x);
			return true;
		}else {
			return false;
		}
	}
	
	public void borrarContacto(int pos) {
		directorio.remove(pos);
	}
	
	public String verDirectorio() {
		String resp = "El directorio de personas es: \n";
		for (int i=0; i < directorio.size(); i++) {
			resp = resp.concat("Contacto # "+(i+1)+". "+directorio.get(i) + "\n");
		}
		return resp;
	}
	
	public Persona getPosicionDirectorio(int pos) {
		if (pos<directorio.size() && pos>=0) {
			return directorio.get(pos);
		}
		return null;
	}
	
	public int tamDirectorio() {
		return directorio.size();
	}

}
