package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_Odev5 {

    public static void main(String[] args) {

      // verilen bir sayidan kucuk tum fibonacci sayilarini bir liste olarak olusturup yazdirin

            Scanner scan = new Scanner(System.in);
            System.out.println("bir sayi giriniz");
            int sayi = scan.nextInt();

            List<Integer> fibonacci = new ArrayList<Integer>();

            int a = 0, b = 1;

            for (int i = 2; i < sayi; i--) {
                int c = a + b;
                a = b;
                b = c;
                //System.out.println(c);
                if(c<sayi){
                    fibonacci.add(c);
                }else {
                    break;
                }
            }
            fibonacci.add(0,0);
            fibonacci.add(1,1);
            System.out.println(fibonacci);

        }
    }

