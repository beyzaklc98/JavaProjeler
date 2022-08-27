package day17_nestedForLoop;

public class C15_Odev5 {

    public static void main(String[] args) {

        /* Soru 5) Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana yazdirin.
                   Kullanicinin hata yapmadigini farz edin.
                   Ornegin kullanici 3 girerse;
        3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
         */

        int rakam = 3;
        int bas = 1;
        int bit = 10;

        while (bas <= bit) {
            System.out.print(bas + "x" + rakam + "=" + bas * rakam + " ");
            bas++;
        }
    }
}
