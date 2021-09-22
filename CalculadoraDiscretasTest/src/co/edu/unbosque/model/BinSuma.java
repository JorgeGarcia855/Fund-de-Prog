package co.edu.unbosque.model;

public class BinSuma {

	public String sumaBin(long bin1, long bin2) {
		String resul = "";
		int i = 0, acarreo = 0;
		int[] suma = new int[10];
		while(bin1 != 0|| bin2 != 0) {
			suma[i++] = (int) (((bin1%10) + (bin2%10) + acarreo) % 2);
			acarreo = (int) (((bin1%10) + (bin2%10) + acarreo) / 2);
			bin1 = bin1/10;
			bin2 = bin2/10;
		}
		if (acarreo != 0) {
			suma[i++]= acarreo;
		}
		--i;
		while (i>=0) {
			resul = resul + suma[i--];
		}
		return resul;
	}

}
