package day13_methodCreation;

import java.util.Scanner;

public class C05_MethodCreation {

    public static void main(String[] args) {

        // Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
        //        - @ isareti icermiyorsa gecersiz email yazdirin
        //        - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
        //        - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”


        String gmail=gmailKontrolu();
    }
    public static String gmailKontrolu() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.nextLine();

        if (!sifre.contains("@")){
            System.out.println("gecersiz email");
        } else if (!sifre.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresinizi giriniz");
        } else if (!sifre.endsWith("@gmail.com")){
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
        } else{
            System.out.println("Dogru gmail adresi");
        }
        return sifre;
    }
}
