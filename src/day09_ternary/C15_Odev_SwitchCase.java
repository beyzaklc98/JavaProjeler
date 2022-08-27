package day09_ternary;

import java.util.Scanner;

public class C15_Odev_SwitchCase {

    public static void main(String[] args) {

        // Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen  bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();

        switch (gunIsmi) {
            case "cumartesi" :
                System.out.println("haftasonu");
                break;
            case "pazar" :
                System.out.println("haftasonu");
                break;
            case "pazartesi" :
                System.out.println("haftaici");
                break;
            case "sali" :
                System.out.println("haftaici");
                break;
            case "carsamba" :
                System.out.println("haftaici");
                break;
            case "persembe" :
                System.out.println("persembe");
                break;
            case "cuma" :
                System.out.println("cuma");
                break;
            default :
                System.out.println("Lutfen gecerli bir gun giriniz");
        }
    }
}
