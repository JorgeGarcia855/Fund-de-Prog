package co.edu.unbosque.controller;

import java.util.Scanner;

public class ControllerEJ5 {

    private static final Scanner leer = new Scanner(System.in);
	
	public ControllerEJ5() {
		funcionar();
	}
	
	public void funcionar() {
		double urg = 0.37, ped = 0.42, tra = 0.21;
		String resul;
		System.out.println("Digite el presupuesto del hospital: $");
		double pre = leer.nextDouble();
		if(pre>0) {
			double preU = pre * urg;
			double preP = pre * ped;
			double preT = pre * tra;
            resul = "El presupuesto de Urgencias es de: $"+ preU +"\n"+
                    "El presupuesto de Pediatría es de: $"+ preP +"\n"+
                    "El presupuesto de Traumatología es de: $"+ preT;
		} else {
			resul = "Ingrese un numero valido.";
		}
		System.out.println(resul);
	}
}
