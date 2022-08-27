package day04_dataCasting;

public class C02_DataCasting {

    public static void main(String[] args) {

        int sayi1 = 23;
        int sayi2 = 5;
        System.out.println(sayi1/sayi2); // 4 ikisi de int oldugundan virgul sonrasini sildi

        System.out.println(25*7/3); // 58.333 ---> 58 ?

        double sayi3 = 5;
        System.out.println(sayi1/sayi3); // 4.6 // iki variable'nin data turu degisik oldugunda
                                                // daha kapsamli olani data turu olarak kabul eder.
    }
}
