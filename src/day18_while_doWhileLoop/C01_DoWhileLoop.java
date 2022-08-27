package day18_while_doWhileLoop;

public class C01_DoWhileLoop {

    public static void main(String[] args) {

        int sayi=7;

        while(sayi<10){ // 7<10 true, loop bady devreye girecek, 7 yazilacak
                        // sonra sayi 1 artacak, 8<10 true, loop bady calisacak
                        // sonra sayi 1 artacak, 9<10 true, loop bady calisacak
                        // sonra sayi 1 artacak, 10<10 false, loop bady kirilir
                        // sart 4 kere kontrol edildi, bunun yerine islemi yapip sonra kontrol edebiliriz

            System.out.print(sayi+" ");
            sayi++;
        }
        System.out.println(" ");

        /*
         do-while loop ile calistigimizda bu dezavantaj ortadan kalkar
         */
        sayi=7;

        do{
            System.out.print(sayi+ " ");
            sayi++;
        }while(sayi<10);
    }
}
