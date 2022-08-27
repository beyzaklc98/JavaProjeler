package pratik3;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {

        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome(duz ve tersten okunusu ayni)
        // olup olmadigini kontrol eden bir program yazin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str=scan.nextLine();

        palindrom(str);
    }

    private static void palindrom(String str) {

        String tersInput="";

        for (int i = (str.length()-1); i >= 0; i--) {

            tersInput+=str.charAt(i);
        }

        if(tersInput.equals(str)){
            System.out.println("girilen kelime palindrome'dur");
        }else{
            System.out.println("girilen kelime palindrome degildir");
        }
    }
}
