package day05_matematikselislemler;

public class C02_Pre_Post_Increment {

    public static void main(String[] args) {

        int sayi=10;

        System.out.println("pre-increment : " + ++sayi); // 11

        System.out.println("post-increment : " + sayi++); // 11

        // System.out.println(++sayi); yazdırırsam 13 oluyor

        System.out.println("post-incremet'den sonra : " + sayi); // 12

        sayi++; // 13 tek basina yazarsak pre ve post olursa ikisinde de artar
        System.out.println(sayi); // 13
        ++sayi; // 14
    }
}
