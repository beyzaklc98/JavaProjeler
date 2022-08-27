package day17_nestedForLoop;

public class C13_Odev3 {

    public static void main(String[] args) {

        //  Soru 3 ) Kullanicidan baslangic ve bitis degerlerini alin.
        //           Baslangic degeri ve bitis degeri dahil aradalarindaki
        //           tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

        int bas=-5;
        int bit=113;

        while (bas<=bit) {
            if (bas%2==0) {
                System.out.print(bas+" ");
            }
            bas++;
        }
    }
}
