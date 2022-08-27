package day16_forLoop;

import java.util.Scanner;

public class C04_Odev {

    public static void main(String[] args) {

         //kullanicidan pozitif bir rakam girmesini isteyin
         //ve girilen rakama gore carpım taplosu olusturun
         //orn kullanici 3 girerse 3 6 9

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int rakam=scan.nextInt();

        int carpim=1;

        for (int i = 1; i <=10; i++) {
            carpim=rakam*i;
            System.out.println(rakam+"x"+i+"="+carpim);
        }
        System.out.println("");

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }
}
