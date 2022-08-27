package day15_overloading_forLoop;

public class C01_ReturnMethod {

    public static void main(String[] args) {

        // verilen 2 sayiyi carpip
        // sonucu bize donduren bir method olusturun
        // dondur, return et diyorsa return yapariz

        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1,sayi2);  // sonuc bize methoddan geliyor
                                           // getirdigi degeri atamak icin variable olusturduk
                                           // carpGetir methodu var onlari alip diger methoda gider
                                           // sonucu da alip tekrar getirir
                                           // sout istedigimiz yere yazilabilir yazmak da zorunda degiliz
                                           // istedigimiz zaman alip kullanabiliriz

        System.out.println("Illa da sonucu goreyim diyenlere main method icinde : " +sonuc);
    }

    public static int carpGetir(int sayi1, int sayi2) {

        // return sayi1*sayi2; // boyle de yazabilirdik.

         int sonuc=sayi1*sayi2;
         System.out.println("Illa da sonucu goreyim diyenlere main method icinde : " +sonuc);
         return sonuc;
    }
}
