package day04_dataCasting;

public class C06_DataCastingOdev2 {

    public static void main(String[] args) {

        // Soru4) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip yazdirin

        double sayi1 = 255.36;
        int sayi2 = (int) sayi1; // 255
        byte sayi3 = (byte) sayi2; // 255 ----> -1
        System.out.println(sayi3); // 255 ----> -1

        // Soru5) int 2 sayiyi birbirine boldurun ve sonucu yazdirin

        int sayi5 = 98;
        int sayi6 = 33;
        System.out.println(sayi5 / sayi6); // 2 ----> virgul sonrasini sildi

        // Soru6) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin

        int sayix = 68;
        double sayiy = 4;
        System.out.println(sayix / sayiy); // 17.0
    }
}
