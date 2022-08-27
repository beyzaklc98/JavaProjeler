package daay3;

import java.util.Scanner;

public class Q05_StringManipulation {

    public static void main(String[] args) {

        // Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String firstName= scan.nextLine();
        System.out.println("Lutfen isminizi yaziniz");
        String lastName = scan.nextLine();

        String fullName = firstName.concat(" "+ lastName).toUpperCase();

        System.out.println("fullName: " + fullName);


    }
}
