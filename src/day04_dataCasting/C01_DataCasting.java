package day04_dataCasting;

public class C01_DataCasting {

    public static void main(String[] args) {

        char harf = 'a';
        char yeniHarf = (char) (harf + 1);
        // burada sag islem yapildi sonuc 98 yani tamsayi
        // onun icin auto widening yapildi
        // kod bu durumda once sagdaki islemi yapar
        // char yeniHarf = 97 + 1 = 98
        // ***** char bir variable 98 olamayacagi icin Java hata verir
        System.out.println(yeniHarf); // b char a'nin ASKİİ degeri 98'in harf karsiligini aldi **********

        // bazen bir variable olusturuldugu data turu disindan deger atanabilir
        // bunlardan bazilarini Java otomatik olarak kabul eder

        // Java eger bu deger atamasinda sorun olusacagini
        // (data kayıplarının olabilecegi veya datanin baskalasabilecegi) gorurse
        // otomatik olarak bu atamayi kabul etmez
        // sizden eger bu atamayi istiyorsaniz sorumlulugu almanizi ister

        int sayi1 = (int) 7.3; // 7.3 double sag tarafta
        System.out.println("sayi1: " +sayi1); // 7 ----> virgulden sonrasini sildi, int diye

        double sayi2 = 10;
        System.out.println("sayi2: " + sayi2); // 10.0

        int sayi3 = 'c';
        System.out.println("sayi3: " + sayi3); // 99

        char harf2 = (char) 98;
        System.out.println("harf2: " + harf2); // b
    }
}
