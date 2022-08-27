package day17_nestedForLoop;

public class C11_Odev1 {

    public static void main(String[] args) {

        // Soru 1 ) While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.

        int bas=3;
        int son=13;

        while (bas<=son){
            if (!(bas%2==0)){
                System.out.print(bas+" ");
            }
            bas++;
        }
    }
}
