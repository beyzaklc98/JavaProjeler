package day18_while_doWhileLoop;

public class C04_Odev2 {

    public static void main(String[] args) {

        // Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.

        char bas='m';
        char bit='c';
        char temp=bas;

        do {
            System.out.print(temp+" ");

            temp--;
        } while (temp>=bit);
    }
}
