package day15_overloading_forLoop;

import java.util.Scanner;

public class C12_Odev4 {

    public static void main(String[] args) {

        // Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {

            if(i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
