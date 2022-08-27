package day03_scanner;

import java.util.Scanner;

public class C09_ScannerOdev {

    public static void main(String[] args) {

        // Soru1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen iki tamsayi giriniz\n aralarda enter'a basiniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);

        // Soru2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin

        Scanner scan1 = new Scanner (System.in);
        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
        double x= scan.nextDouble();
        System.out.println("karenin cevresi: " + 4*x);
        System.out.println("karenin alani: " + x*x);

        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        // prizmanin hacmini hesaplayip yazdirin

        Scanner scan2= new Scanner (System.in);
        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz");
        double a= scan.nextDouble();

        System.out.println("Lutfen dikdortgen prizmanin kisa kenarini giriniz");
        double b= scan.nextDouble();

        System.out.println("Lutfen dikdortgen prizmanin yuksekligini giriniz");
        double c= scan.nextDouble();

        System.out.println("prizmanin hacmi:" + a*b*c);
    }
}
