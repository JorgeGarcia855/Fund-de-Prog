package co.edu.unbosque.controller;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Random;

public class Controller {
	
	public Controller() {
		enMathRandom();
		//enLibRandom();
		//comoFormatear();
	}
	
	public void enMathRandom() {
		//numero double entre [0,1]
		double num_real = Math.pow(10, 4-1)+Math.random()*(Math.pow(10, 4)-1);
		
		int entero = (int)Math.round(num_real);
		System.out.println(entero);
//		//numero double entre [0,20]
//		num_real = Math.random()*20;
//		System.out.println(num_real);
//		
//		//numero double entre [95,99]
//		// = (min)+Math.random()*(max-min)
//		num_real = 95 + Math.random()*4;
//		System.out.println(num_real);
//		
//		//numero entero entre [0,1]
//		int num_entero = (int) Math.random();
//		System.out.println(num_entero);
//				
//		//numero entero entre [0,20]
//		num_entero = (int) (Math.random()*20);
//		System.out.println(num_entero);
//				
//		//numero entero entre [95,99]
//		// = (min)+Math.random()*(max-min)
//		num_entero = 95 + (int)(Math.random()*4);
//		System.out.println(num_entero);
	}
	
	public void enLibRandom() {
		Random rnd;
		rnd = new Random(System.currentTimeMillis());
		
		//numero real [0,1)
		double num_real = rnd.nextDouble();
		System.out.println(num_real+"\n");
		
		//numero real [0,20)
		num_real = rnd.nextDouble()*20;
		System.out.println(num_real);
		
		//numero real [45,55)
		num_real = 45+rnd.nextDouble()*10;
		System.out.println(num_real);
		
		//numero entero [-2147483648,2147483647] (integer min, integer max)
		int num_entero = rnd.nextInt();
		System.out.println(num_entero);
		
		//numero entero [0,20]
		num_entero = Math.abs(rnd.nextInt()%21);
		System.out.println(num_entero);
		
		//numero entero [0,20] (asignando valor al nextInt())
		num_entero = rnd.nextInt(21);
		System.out.println(num_entero);
		
		//numero entero [5,15]
		// = min + rnd.nextInt((max-min)+1)
		num_entero = 5 + rnd.nextInt(11);
		System.out.println(num_entero);
		
		
	}
	
	public void comoFormatear() {
		Random rnd;
		rnd = new Random(System.currentTimeMillis());
		
		//para mostrar x cantidad de decimales con [35,55) usando String.format
		double num_real = 35 + rnd.nextDouble()*20;
		System.out.println(num_real);
		String aux = String.format("%.02f", num_real);
		System.out.println(aux);
		
		StringBuilder sb = new StringBuilder();
		@SuppressWarnings("resource")
		Formatter formatter = new Formatter(sb);
		formatter.format("%.3f", num_real);
		System.out.println(formatter.toString());
		
		System.out.printf("El numero es el nuevo formato %.3f del numero anterior %.6f", num_real, num_real);
		
		//Otra forma de formatear usando DecimalFormat
		DecimalFormat df = new DecimalFormat("#.##");
		String aux2 = df.format(num_real);
		System.out.println("\n"+aux2);
	}

}
