package day03_scanner;

public class C03_Swap2 {

    public static void main(String[] args) {

    /*
        1- Verilen sayi1 ve sayi2 variable' larinin  degerlerini
        ucuncu bir variable kullanmadan degiştiren (SWAP) bir program yaziniz
        Orn : sayi1=10 ve sayi2=20;
        kod caliştiktan sonra
        sayi1=20 ve sayi2=10
      */
            int sayi1= 30;
            int sayi2= 20;

            System.out.println("Swaptan once sayi1 : " + sayi1 + " " + "sayi2 : " + sayi2);
            sayi1= sayi1+sayi2; //sayi1=50
            sayi2= sayi1-sayi2; //sayi2=30
            sayi1=sayi1-sayi2; //sayi1=20
            System.out.println("Swaptan sonra sayi1 : " + sayi1 + " " + "sayi2 : " + sayi2);
    }
}
