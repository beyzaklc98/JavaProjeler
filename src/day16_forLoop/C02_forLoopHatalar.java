package day16_forLoop;

public class C02_forLoopHatalar {

    public static void main(String[] args) {

        // baslangic noktasindan sonra
        // bitis sartina yaklasmiyorsak sonsuz loop olusur

        /* for (int i = 0; i >-10 ; i++) { // baslangicdan bitise gitmezse loop sonsuza gider
            System.out.println(i);
         */

        // eger ilk deger icin bile bitis sarti saglanmiyorsa
        // for loop calisir
        // ama loop bady'si hicbir zaman devreye girmez (calismaz)
        for (int i = 0; i >5 ; i++) {  // loop kirildi 0>5 olmaz
            System.out.println(i);
        }
    }     // bu satira gecer
}

