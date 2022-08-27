package day18_while_doWhileLoop;

import java.util.Scanner;

public class C05_Odev3 {

    public static void main(String[] args) {

        // Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
        //         Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini
        //         ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int pozitif=0;

        do{
            System.out.println("Lutfen pozitif bir sayi giriniz");
            sayi=scan.nextInt();
            pozitif+=1;

            if (sayi>0){
                toplam+=sayi;
                System.out.println("Girdiginiz pozitif sayilarin toplami : "+toplam);
                System.out.println("islemi bitirmek icin 0'a basiniz");
            } else{
                if (sayi==0)
                    System.out.println("islem sonlandi : "+pozitif+" pozitif sayi girdiniz");
                break;
            }
            sayi++;
        } while(sayi>0);
    }
}
