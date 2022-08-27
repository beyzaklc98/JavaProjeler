package day12_stringManipulation;

import java.util.Scanner;

public class C10_Odev {

    public static void main(String[] args) {

        // Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
        // “Sifre basari ile tanimlandi”, sartlari saglamazsa
        // “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //- Ilk harf buyuk harf olmali
        //- Son harf kucuk harf olmali
        //- Sifre bosluk icermemeli
        //- Sifre uzunlugu en az 8 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("sifre giriniz");
        String sifre = scan.nextLine();

        char ilkharf = sifre.charAt(0);
        int uzunluk = sifre.length();
        char sonharf = sifre.charAt(sifre.length() - 1);

        if ((uzunluk < 8)) {
            System.out.println("islem basarisiz, lütfen yeni bir sifre girin");
        } else if ((ilkharf <= 'Z' && ilkharf >= 'A') && (sonharf <= 'z' && sonharf >= 'a') && (!sifre.contains(" "))) {
            System.out.println("sifre basari ile tanimlandi");
        } else {
            System.out.println("islem basarisiz, lütfen yeni bir sifre girin");
        }
    }
}
