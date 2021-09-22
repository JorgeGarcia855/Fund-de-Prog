package co.edu.unbosque.model;

public class Persona {
	
	private final String nombre;
	private final long telefono;
	
	public Persona() {
		nombre = "";
		telefono = 0;
	}
	
	public Persona(String nombre, long telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " --> Telefono: " + telefono;
	}

}
