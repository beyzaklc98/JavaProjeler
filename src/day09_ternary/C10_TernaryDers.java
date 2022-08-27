package day09_ternary;

import java.util.Scanner;

public class C10_TernaryDers {

    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // sayi pozitifse sayiyi yazdirin
        // sayi sifir veya negatifse bir sayi daha isteyin ve ikisinin carpımını yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi1 = scan.nextDouble();

        if (sayi1>0) {
            System.out.println(sayi1);
        } else {
            System.out.println("Lutfen bir sayi daha giriniz"); // **********
            double sayi2 = scan.nextDouble();
            System.out.println(sayi1*sayi2);
        }

        // eger if else icerisinde yeni kodlar varsa
        // ternary ile yapmamiz mumkun olmaz
        // icerde yeniden kod yazmamiz gereken seyler varsa ternaryde yapamayiz

    }
}
