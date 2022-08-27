package day09_ternary;

import java.util.Scanner;

public class C12_Odev_SwitchCase {

    public static void main(String[] args) {

        // Soru 2 : Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ayda oldugunuzu giriniz");
        int ay = scan.nextInt();

        switch (ay) {
            case 1:
                System.out.println("ay ismi: " + "ocak");
                break;
            case 2:
                System.out.println("ay ismi: " + "subat");
                break;
            case 3:
                System.out.println("ay ismi: " + "mart");
                break;
            case 4:
                System.out.println("ay ismi: " + "nisan");
                break;
            case 5:
                System.out.println("ay ismi: " + "mayis");
                break;
            case 6:
                System.out.println("ay ismi: " + "haziran");
                break;
            case 7:
                System.out.println("ay ismi: " + "temmuz");
                break;
            case 8:
                System.out.println("ay ismi: " + "agustos");
                break;
            case 9:
                System.out.println("ay ismi: " + "eylul");
                break;
            case 10:
                System.out.println("ay ismi: " + "ekim");
                break;
            case 11:
                System.out.println("ay ismi: " + "kasim");
                break;
            case 12:
                System.out.println("ay ismi: " + "aralik");
                break;
            default :
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");
        }
    }
}
