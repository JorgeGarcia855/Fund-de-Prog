package co.edu.unbosque.controller;

import java.util.Scanner;

public class ControllerEJ6 {
Scanner leer;
	
	public ControllerEJ6() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		int hdt = 0;
        int vdh = 20000;
        int total = 0;
        int total2 = 0;
        String resul = "";
        hdt = leer.nextInt();
        
        if(hdt>0 && hdt<=40){
            total = hdt*vdh;
            resul = ""+total;
        }else if(hdt>40 && hdt<=48){
            total = 40*vdh;
        	total2 = total+((hdt-40)*(vdh*2));
            resul = ""+total2;
        }else if(hdt>48){
            total = 40*vdh;
        	total2 = total+((hdt-40)*(vdh*2));
            resul = ""+total2;
        }else{
            total = hdt*0;
            resul = ""+total;
        }
        
        System.out.println(resul);
		
		
	}

}
