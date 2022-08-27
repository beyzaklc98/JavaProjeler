package day17_nestedForLoop;

import java.util.Scanner;

public class C16_Odev6 {

    public static void main(String[] args) {

        // Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
        //          ve toplam kac tane olduklarini ekranda yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        int bas=1;
        int sayac=0;

        while (bas<=sayi) {
            if (sayi%bas==0){

                System.out.print(bas+" ");
                sayac++;
            }
            bas++;
        }
        System.out.println(" ");
        System.out.print(sayi+" sayisinin "+ sayac+" adet boleni var");
    }
}
