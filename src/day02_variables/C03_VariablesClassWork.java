package day02_variables;

public class C03_VariablesClassWork {

    public static void main(String[] args) {

        // 2) isim ve soyisim icin 2 variable olusturun ve bunlari
        // isminiz: Mehmet
        // soyisminiz: Bulutluoz  seklinde yazdirin

        String isim= "Beyza";
        String soyIsim= "Kilic";
        System.out.println("isminiz:" +isim);
        System.out.println("soyisminiz:" +soyIsim);

        // 3) Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int sayi1= 87;
        short sayi2= 30500;
        System.out.println(sayi1 + sayi2); // 30587

        // 4) Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin

        int sayi3= 67;
        double sayi4= 2;
        System.out.println(sayi3 + sayi4); // 69.0

        // 5) char data turunde bir variable olusturun ve yazdirin

        char ikinciHarf= 'E';
        System.out.println(ikinciHarf); // E

        // 6) Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin

        byte kisiSayisi= 8;
        char karakter= '#';
        System.out.println(kisiSayisi + karakter); // char matematiksel isleme girdiginde
                                                   // ASKII degerini alıp yazdırır
    }
}
