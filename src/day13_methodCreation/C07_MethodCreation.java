package day13_methodCreation;

import java.util.Scanner;

public class C07_MethodCreation {

    public static void main(String[] args) {

        /*
        Kullanicidan ismini,soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin
        isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
        KK numarasini ise 4 rakamlik 4 blok olacak sekilde duzelten 2 method yazin,ve programda kullanabilmek
        icin duzenlenmis hallerini geri dondurun
         */

        String str =isim();
        String kart=no();
    }
    public static String no() {
        Scanner scan=new Scanner(System.in);
        System.out.println("16 haneli kart numarasi giriniz");
        String kart= scan.nextLine();

        System.out.println(kart.substring(0,4)+" "+kart.substring(4,8)+" "+kart.substring(8,12)+" "+kart.substring(12,16));
        return kart;
    }

    public static String isim() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Isim giriniz : ");
        String isim = scan.nextLine();

        System.out.print("Soyisim giriniz : ");
        String soyisim = scan.nextLine();

        System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase()+" "+
                soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase());
        return isim+" "+ soyisim; // **********
       }
    }

