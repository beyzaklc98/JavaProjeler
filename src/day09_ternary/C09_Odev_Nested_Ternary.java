package day09_ternary;

import java.util.Scanner;

public class C09_Odev_Nested_Ternary {

    public static void main(String[] args) {

        // Soru5 : Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”,
        //         yoksa “Uc basamakli degil” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi>99 && sayi<1000 ? "uc basamakli sayi" : "uc basamakli degil");
    }
}
