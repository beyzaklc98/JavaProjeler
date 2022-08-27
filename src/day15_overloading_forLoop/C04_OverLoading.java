package day15_overloading_forLoop;

public class C04_OverLoading {

    public static void main(String[] args) {

        topla(5,7); // 12
        topla(5.2,3); // 8.2
        topla(3.4,6.1); // 9.5
        topla(5,6.2); // 11.2 ----> 2'sini de double gorur
    }

     /*
      Java hangi methodun calisacagina karar verirken optimizasyon yapar
      - eger hic cast yapmadan kullanabilecegi method varsa onu kullanir
      - eger cast yapmadan kullanacagi bir method yoksa, en az cast yaparak kullanabilecegi methodu tercih eder
     */

    public static void topla(int sayi1, int sayi2){
        System.out.println("Iki integer'in toplami : " +(sayi1 + sayi2)); // 12
    }

    public static void topla(double sayi1, int sayi2){
        System.out.println("bir double ve bir integer'in toplami : " +(sayi1 + sayi2)); // 8.2
    }

    public static void topla(double sayi1, double sayi2){
        System.out.println("iki double'in toplami : " +(sayi1 + sayi2)); // iki double'in toplami : 9.5
                                                                         // iki double'in toplami : 11.2

    }
}
