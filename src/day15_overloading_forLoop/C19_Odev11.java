package day15_overloading_forLoop;

import java.util.Scanner;

public class C19_Odev11 {

    public static void main(String[] args) {

        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin
        // ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk bir tamsayi giriniz");
        int sayi=scan.nextInt();

        int toplam=1;
        for (int i = 1; i <=sayi ; i++) {

            toplam*=i;
        }
        System.out.println("toplam : "+toplam);
    }
}
