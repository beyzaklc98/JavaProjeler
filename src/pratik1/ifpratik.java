package pratik1;

import java.util.Scanner;

public class ifpratik {

    public static void main(String[] args) {

        // kullanicidan iki sayi alin ve kullanicidan aldiginiz 1. sayiya kadar olan sayilarin
        // 2. sayiya bolumunden kalan 0 ise bu sayilari toplatin
        // method seklinde yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi girin");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        kalanToplam(sayi1, sayi2);
    }

    public static void kalanToplam(int sayi1, int sayi2) {

        int toplam=0;

         int bolunebilen= sayi1/sayi2;

         if(sayi1>sayi2){
             for (int i=0; i<sayi1; i++) {


                 if (sayi1%sayi2==0){

                     toplam+=bolunebilen;
                 }
                 System.out.println(toplam);
         }

        }
    }
}
