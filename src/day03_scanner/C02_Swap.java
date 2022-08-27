package day03_scanner;

public class C02_Swap {

    public static void main(String[] args) {

          /*
        1- Verilen sayi1 ve sayi2 variable' larinin  degerlerini degiştiren (SWAP) bir program yaziniz
        Orn : sayi1=10 ve sayi2=20;
        kod caliştiktan sonra
        sayi1=20 ve sayi2=10
      */

        int sayi1 = 10;
        int sayi2 = 20;
        // int temp=0; da 3. variable olarak yazabiliriz
        System.out.println("Swaptan once sayi1 :" + sayi1 + " , sayi2 :" + sayi2);

        // 1. adim boş bir variable oluşturup
        // sayi 1'i ona atayalim
        int temp = sayi1; // temp 10

        // 2. adim sayi 1'e  yeni degerini atayalim
        sayi1 = sayi2; // sayi1= 20

        // 3. adim sayi2'ye temp'e yedekledigimiz sayi1 degerini atayalim
        sayi2 = temp; // sayi2= 10
        System.out.println("Swaptan sonra sayi1 :" + sayi1 + " , sayi2 :" + sayi2);
    }
}
