package co.edu.unbosque.model;

public class Ciclos {

	public static void ejercicio39() {
		int x = 0;
		int y = 1;
		int ac = 0;
		System.out.println(x);
		System.out.println(y);
		while(ac<=10000) {
			ac=x+y;
			x=y;
			y=ac;
            System.out.println(ac);
		}
	}
}
