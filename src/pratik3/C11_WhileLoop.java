package pratik3;

import java.util.Scanner;

public class C11_WhileLoop {

    public static void main(String[] args) {

        /*
          kullanicidan toplanmak uzere sayilar alin *************
          sayilarin toplami 500'u gecince
          sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin

          13 sayi girdiniz ve toplamlari 567
         */

        int toplam=0;
        int sayi=0;
        int sayac=0;

        Scanner scan=new Scanner(System.in);
        while(toplam<500) {
            System.out.println("Lutfen toplanmak uzere sayi giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;
            sayac++;
        }
        System.out.println(toplam);
    }
}
