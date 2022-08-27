package day04_dataCasting;

public class C07_DataCastingOdev3 {

    public static void main(String[] args) {

        // Soru7) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim

        double sayi1 = 334.456;
        int sayi2 = (int) sayi1;
        System.out.println(sayi2); // 334

        byte sayi3 = (byte) sayi2;
        System.out.println(sayi3); // 78

        int sayi4 = 511;
        byte sayi5 = (byte) sayi4;
        System.out.println(sayi5); // -1

        int x = 45;
        short y = 50;
        double z = 7.3;
        System.out.println(x + y + z); // 102.3

        int a = 39;
        byte b = 12;
        System.out.println(a / b); // 3
    }
}
