package day07_ifStatements;

import java.util.Scanner;

public class C08_Odev {

    public static void main(String[] args) {

        // Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz");
        double a= scan.nextDouble();

        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz");
        double b= scan.nextDouble();

        if (a>b || b>a){
            System.out.println("dikdortgendir");
        } else{
            System.out.println("karedir");
        }
    }
}
