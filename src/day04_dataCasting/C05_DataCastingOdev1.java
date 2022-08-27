package day04_dataCasting;

public class C05_DataCastingOdev1 {

    public static void main(String[] args) {

        // Soru1) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        // birer degisken olusturup adim adim widening yapin ve yazdirin

        byte sayi1 = 9;
        short sayi2 = sayi1;
        System.out.println(sayi2); // 9

        int sayi3 = sayi1 + sayi2;
        sayi3 = sayi1 * sayi2;
        System.out.println(sayi3); // 81

        byte x = 13;
        float y = 23f;
        double a = x + y;
        System.out.println(a); //36.0

        a = sayi3 / sayi1;
        System.out.println(a); // 9.0

        byte z = 126;
        double b = 3;
        float c = (float) (z / b);
        System.out.println(c); // 42.0

        // Soru2) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        int number1 = 34;
        byte number2 = (byte) number1;
        System.out.println(number2); // 34

        short number3 = (short) number1;
        System.out.println(number3); // 34

        short number4 = (short) (number1 + number2);
        System.out.println(number4); // 68

        // Soru3) Float data turunde bir variable olusturun ve yazdirin

        float ondalikli = 7f;
        System.out.println(ondalikli); // 7.0
    }
}
