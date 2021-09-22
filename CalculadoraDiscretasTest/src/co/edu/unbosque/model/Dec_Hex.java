package co.edu.unbosque.model;

public class Dec_Hex {
	
	public String decHex(int decnum) {
		String resul = "";
		char hexnum[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int res = 0;
		while (decnum>0) {
			res= decnum%16;
			resul = hexnum[res]+resul;
			decnum = decnum/16;
		}
		return resul;
	}
	
}
