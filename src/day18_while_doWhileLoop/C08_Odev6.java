package day18_while_doWhileLoop;

import java.util.Scanner;

public class C08_Odev6 {

    public static void main(String[] args) {

        // Soru 6 ) Kullanicidan toplamak icin sayi isteyin ve toplam 500’e ulasincaya kadar devam istemeyi ettirin.
        //          Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int girilen=0;

        do{
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            girilen+=1;

            if(toplam>=500){
                System.out.println("girilen sayilarin toplam : "+toplam);
                System.out.println("toplam "+girilen+" sayi girildi");
                break;
            }
            sayi++;
        }while(sayi<500);
    }
}
