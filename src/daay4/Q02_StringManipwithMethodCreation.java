package daay4;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {

    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir string girin :");
        String str=scan.nextLine().toLowerCase();

        System.out.println(xyzVarMi(str));
    }

    private static boolean xyzVarMi(String str) { // *****
        if(str.contains("xyz")){
            return true;
        }else
            return false;
    }
}
