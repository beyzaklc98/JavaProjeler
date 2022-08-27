package pratik3;

import java.util.Scanner;

public class C04_ForLoop {

    public static void main(String[] args) {

        // Soru 10 ) Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int x=scan.nextInt();
        int y=scan.nextInt();

        sayilariTopla(x, y);
    }

    private static void sayilariTopla(int x, int y) {

        int toplam=0;

        if(x<=y){
            for (int i = x; i <y ; i++) {
                toplam+=i;
            }
            }else if(x>y){
            for (int i = x; i <y ; i--) {
                toplam+=i;

            }
        }
        System.out.println(toplam);
    }
}
