package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip
        // girilen bilgiler = tuba sahin 30 seklinde yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen isminizi giriniz: ");
        String isim = scan.nextLine();

        // Stirng verileri scanner alinirken next(): ilk bosluga kadar olan kismi yani 1 kelime alir
        // nextLine(): satirin sonuna kadar ne yazarsak alir
        // eger art arda birden fazla String deger alacaksan nextLine() kullanmalıyız

        System.out.print("Lutfen soyisminizi giriniz: ");
        String soyisim = scan.nextLine();

        System.out.print("Lutfen yasinizi giriniz: ");
        double yas = scan.nextDouble();

        System.out.println("girilen bilgiler:" + isim + "  " + soyisim + "  " + yas);

    }
}
