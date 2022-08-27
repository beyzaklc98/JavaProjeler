package day09_ternary;

import java.util.Scanner;

public class C01_Odev_Ternary {

    public static void main(String[] args) {

        // Soru1 : Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println(sayi1 > sayi2 ? sayi2 : sayi1);
    }
}
