package day15_overloading_forLoop;

import java.util.Scanner;

public class C18_Odev10 {

    public static void main(String[] args) {

        // Soru 10 ) Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini girin");
        int bas= scan.nextInt();
        System.out.println("Lutfen bitis degerini girin");
        int bitis= scan.nextInt();

        aralariTopla(bas,bitis); // dondurmeyecek yazdiracak
    }

    public static void aralariTopla(int bas, int bitis) {

        int toplam=0;
        if (bas<=bitis) {
            for (int i = bas; i <=bitis ; i++) {
                toplam+=i;
            }
        } else{
            for (int i = bitis; i <=bas ; i++) {
                toplam +=i;
            }
        }
        System.out.println("Aradaki sayilarin toplami : " +toplam);
    }
}
