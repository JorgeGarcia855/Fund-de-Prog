package co.edu.unbosque.model;

public class SerialAuto {
	public int serial;
	
	public SerialAuto() {
		serial = 0;
	}
	public String serialFuncional() {
		String resul ="";
		
		
		if(serial>=14681 && serial<=15681) {
			resul = "El automovil esta defectuoso";
		}else if(serial>=70001 && serial<=79999) {
			resul = "El automovil esta defectuoso";
		}else if(serial>=88888 && serial<=111111){
			resul = "El automovil esta defectuoso";
		}else {
			resul = "El automovil esta en buenas condiciones";
		}
		
		return resul;
	}

}
