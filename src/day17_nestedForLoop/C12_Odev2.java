package day17_nestedForLoop;

public class C12_Odev2 {

    public static void main(String[] args) {

        // Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan
        //         15, 20 ve 90’na tam bolunebilen sayilari yazdirin.

        for (int i = 100; i <=999; i++) {
            if (i%15==0 && i%20==0 && i%90==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");

        int bas=100;
        int bit=999;

        while (bas<=bit) {
            if (bas%15==0 && bas%20==0 && bas%90==0) {
                System.out.print(bas+" ");
            }
            bas++;
        }
    }
}
