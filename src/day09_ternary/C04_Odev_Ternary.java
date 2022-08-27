package day09_ternary;

import java.util.Scanner;

public class C04_Odev_Ternary {

    public static void main(String[] args) {

        // Soru4 : Kullanicidan bir sayi alin.
        //         Sayi pozitifse “Sayi pozitif” yazdirin, negatifse sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi1= scan.nextDouble();

        // eger ternary icindeki sonuclar farkli data turlerinde ise ?
        // atama yapamayiz, sadece yazdirabiliriz
        // double sonuc = sayi>0 ? "Sayi Pozitif" : (sayi1*sayi1);

        System.out.println(sayi1>0 ? "Sayi pozitif" : sayi1*sayi1);
    }
}
