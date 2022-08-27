package pratik3;

import java.util.Scanner;

public class C01_NestedIf {

    public static void main(String[] args) {

        /* Emeklilik kontrolu yapan bir program yaziniz
        cinsiyet olarak E (erkek) veya K (kadin) degiskenleri kabul etsin
        farkli bir harf veya sembol girilirse hata mesaji versin

        emeklilik icin kadinlarda yas siniri 60 erkeklerde 65 olsun

        negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyet giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yas giriniz");
        int yas=scan.nextInt();

        if (cinsiyet=='E'){
            if(yas<0 && yas>80){
                System.out.println("Lutfen gecerli yas giriniz");
            }else if(yas<65){
                System.out.println("emekli olamazsiniz "+(65-yas)+" sene daha calismalisiniz");
            }else{
                System.out.println("emekli olabilirsin");
            }
        }else if(cinsiyet=='K'){
            if(yas<0 && yas>80){
                System.out.println("Lutfen gecerli yas giriniz");
            }else if(yas<60){
                System.out.println("emekli olamazsiniz "+(65-yas)+" sene daha calismalisiniz");
            }else{
                System.out.println("emeli olabilirsin");
            }
        } else{
            System.out.println("Lutfen gecerli cinsiyet giriniz");
        }
    }
}
