package co.edu.unbosque.model;

public final class Operations {

    private Operations(){}

    public static String sumaBin(long bin1, long bin2) {
        StringBuilder resul = new StringBuilder();
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
            resul.append(suma[i--]);
        }
        return resul.toString();
    }

    public static String decBin(int decnum) {
        StringBuilder resul = new StringBuilder();
        int res;
        while(decnum>0) {
            res = decnum%2;
            resul.insert(0, res);
            decnum = decnum/2;
        }
        return resul.toString();
    }

    public static String decHex(int decnum) {
        StringBuilder resul = new StringBuilder();
        char[] hexnum = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int res;
        while (decnum>0) {
            res = decnum%16;
            resul.insert(0, hexnum[res]);
            decnum = decnum/16;
        }
        return resul.toString();
    }

    public static boolean comprobarBinario(long num) {
        while (num!=0) {
            if (num%10>1) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
