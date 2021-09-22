package co.edu.unbosque.model;

public class Dec_Bin {
	
	public String decBin(int decnum) {
		String resul = "";
		int res = 0;
		while(decnum>0) {
			res = decnum%2;
			resul = res+resul;
			decnum = decnum/2;
		}
		return resul;
	}

}
