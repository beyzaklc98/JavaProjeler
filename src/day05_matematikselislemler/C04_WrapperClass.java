package day05_matematikselislemler;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String str= "Java Cok Guzel";
        str.toUpperCase();

        int sayi=10;
        // primitive data turlarinin yaninda method'lar olmaz
        // Java bazi medhod'lari kullanabilmemiz icin
        // her bir primitive data turu icin bir wrapper class olusturulmustur.

        Integer sayi2=10;
        sayi2.byteValue();
    }
}
