package day12_stringManipulation;

import java.util.Scanner;

public class C08_Odev {

    public static void main(String[] args) {

        // Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();

        System.out.println(isim.length()>soyisim.length()?"isim uzundur":"soyisim uzundur");
    }
}
