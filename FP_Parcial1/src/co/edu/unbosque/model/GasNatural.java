package co.edu.unbosque.model;

public class GasNatural {
	public int estsoc;
	public int mtsc;
	public int vmts;
	
	public GasNatural() {
		estsoc = 0;
		mtsc = 0;
		vmts = 5234;
	}
	public String gasFuncional() {
		String resul="";
		
		if((estsoc>=1 || estsoc<=2) && (mtsc<50)) {
			resul= "El descuento es de: "+((vmts*mtsc)*(0.50+0.15));
		}else if ((estsoc>=1 || estsoc<=2) && (mtsc>=50 && mtsc<=100)) {
			resul= "El descuento es de: "+(vmts*mtsc)*(0.50+0.05);
		}else if ((estsoc>=1 || estsoc<=2) && (mtsc>100)) {
			resul= "El descuento es de: "+(vmts*mtsc)*(0.50)+((vmts*mtsc)*0.05); // estrato 1
			
		}else if ((estsoc>=3 || estsoc<=4) && (mtsc<50)) {
			resul= "El descuento es de: "+(vmts*mtsc)*(0.10+0.15);
		}else if ((estsoc>=3 || estsoc<=4) && (mtsc>=50 && mtsc<=100)) {
			resul= "El descuento es de: "+(vmts*mtsc)*(0.10+0.05);
		}else if ((estsoc>=3 || estsoc<=4) && (mtsc>100)) {
			resul= "El descuento es de: "+(vmts*mtsc)*(0.10)+((vmts*mtsc)*0.05);// estrato 2
			
		}else if ((estsoc>=5 || estsoc<=6) && (mtsc<50)) {
			resul= "El descuento es de: "+((vmts*mtsc)+((vmts*mtsc)*0.25))*(0.15);
		}else if ((estsoc>=5 || estsoc<=6) && (mtsc>=50 && mtsc<=100)) {
			resul= "El descuento es de: "+((vmts*mtsc)+((vmts*mtsc)*0.25))*(0.05);
		}else if ((estsoc>=5 || estsoc<=6) && (mtsc>100)) {
			resul= "El descuento es de: "+(vmts*mtsc)+((vmts*mtsc)*0.25)+((vmts*mtsc)*0.05);// estrato 3
			
		}else {
			resul = "Valores Invalidos";
		}
		
		return resul;
	}

}
