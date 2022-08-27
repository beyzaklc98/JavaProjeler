package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        // bir onceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz
        // girilen bilgiler = seyfi capar 34  seklinde yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi,soyisminizi yasiniz giriniz\n aralarda enter'a basiniz");

        String isim=scan.nextLine();
        scan.nextLine();
        String soyIsim= scan.nextLine();
        int yas= scan.nextInt();
        System.out.println("girilen bilgiler: "+ isim +" "+soyIsim+" "+ yas);
      }
    }

