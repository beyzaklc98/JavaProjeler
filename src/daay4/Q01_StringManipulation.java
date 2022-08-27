package daay4;

import java.util.Scanner;

public class Q01_StringManipulation {

    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1. kelimeyi girin :");
        String birinci=scan.next();
        System.out.print("Lutfen 2. kelimeyi girin :");
        String ikinci=scan.next();
        System.out.print("Lutfen 3. kelimeyi girin :");
        String ucuncu=scan.next();
        System.out.print("Lutfen 4. kelimeyi girin :");
        String dorduncu=scan.next();

        System.out.println(birinci.toUpperCase().charAt(0)+birinci.substring(1).toLowerCase()+
                " " +ikinci+ " "+ucuncu+ " "+dorduncu+ ".");

    }
}
