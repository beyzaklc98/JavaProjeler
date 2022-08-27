package day07_ifStatements;

import java.util.Scanner;

public class C12_Odev {

    public static void main(String[] args) {

        // Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
        // Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        // 60 – 80.000 arasinda ise “Konusabiliriz”,
        // 60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen maas teklifinizi giriniz");
        double maas= scan.nextDouble();

        if (maas>80000){
            System.out.println("Kabul ediyorum");
        } else if (60000<=maas && maas<=80000){
            System.out.println("Konusabiliriz");
        } else if (0<maas && maas<60000){
            System.out.println("Maalesef kabul edemem");
        } else {
            System.out.println("Luften gecerli bir maas teklifi girin");
        }
    }
}
