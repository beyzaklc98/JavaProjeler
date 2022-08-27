package day13_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {

    public static void main(String[] args) {

        // Soru 1 ) Kullanicidan bir sayi alin.
        //          Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu kucuk mu oldugunu,
        //          ayrica ve 100’den buyukse birler, onlar ve yuzler basamagindaki rakamlarin toplamini,
        //          100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int sayi = scan.nextInt();

        tekCift(sayi);
        buyukKucuk(sayi);
        birlerBasamagi(sayi);
    }

    public static int birlerBasamagi(int sayi) {

        if (sayi>100) { // dort basamak veya daha fazla olursa son uc rakamindan islem yapar *****

            int birlerBasamagi = 0;
            int rakamlarToplami = 0;

            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;

            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;

            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;

            System.out.println("Rakamlar toplami: " + rakamlarToplami);

        } else {
            int birlerBasamagi=sayi%10;
            System.out.println(birlerBasamagi);
        }
        return sayi;
    }

    public static int buyukKucuk(int sayi) {
        int buyukKucuk=0;
        if (sayi < 0) {
            System.out.println("sifirdan kucuktur");
        } else {
            System.out.println("Sifirdan buyuktur");
        }
        return buyukKucuk;
    }
    public static int tekCift(int sayi) {

        int tekCift =0;

        if (sayi%2==0) {
            System.out.println("sayi cift sayidir.");
        }else {
            System.out.println("Sayi tek sayidir.");
        }
        return tekCift;
    }
}
