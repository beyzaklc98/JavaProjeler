package day18_while_doWhileLoop;

public class C04_Odev2 {

    public static void main(String[] args) {

        // Soru 2 ) âmâ harfinden baslayarak âcâ harfine kadar tum harfleri yazdirin.

        char bas='m';
        char bit='c';
        char temp=bas;

        do {
            System.out.print(temp+" ");

            temp--;
        } while (temp>=bit);
    }
}
