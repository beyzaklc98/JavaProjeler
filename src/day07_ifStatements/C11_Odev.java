package day07_ifStatements;

import java.util.Scanner;

public class C11_Odev {

    public static void main(String[] args) {

        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100 uzerinden kac aldiginizi giriniz");
        double not = scan.nextDouble();

        if (0 < not && not < 50) {
            System.out.println("harf notu: " + "D");
        } else if (50 <= not && not < 60) {
            System.out.println("harf notu: " + "C");
        } else if (60 <= not && not < 80) {
            System.out.println("harf notu: " + "B");
        } else if (80 <= not && not <= 100) {
            System.out.println("harf notu: " + "A");
        } else {
            System.out.println("Lutfen gecerli bir not giriniz");
        }

        // Soru 7) ***** Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lütfen 0'dan 100'e kadar bir not değeri giriniz ");
        double note = scan.nextDouble();
        if (note <= 0 || note > 100) {
            System.out.println("Lutfen gecerli bir not giriniz");
        } else if (note < 50) {    // bu satira geldiysek notumuz 0 ile 100 arasindadir
            System.out.println("Notunuz : D");
        } else if (note < 60) {  // bu satira geldiysek notumuz 50 ile 100 arasindadir
            System.out.println("Notunuz C");
        } else if (note < 80) { // bu satira geldiysek notumuz 60 ile 100 arasindadir
            System.out.println("Notunuz : B");
        } else {
            System.out.println("Notunuz : A");
        }
    }
}
