package day13_methodCreation;

import java.util.Scanner;

public class C06_MethodCreation {

    public static void main(String[] args) {

        // Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin.
        //         Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
        //         KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde duzelten 2 method yazin,
        //         ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.

        String kullanici = kullaniciAdi();
        String kartNumarasi = kartNo();
    }
    public static String kullaniciAdi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim = scan.nextLine();

        System.out.print("Lutfen soyisminizi giriniz: ");
        String soyisim = scan.nextLine();

        char isimIlkharf = isim.toUpperCase().charAt(0);
        String isimKalan = isim.substring(1).toLowerCase();
        String isimSon = isimIlkharf + isimKalan;

        char soyisimIlkharf = soyisim.toUpperCase().charAt(0);
        String soyisimKalan = soyisim.substring(1).toLowerCase();
        String soyisimSon = soyisimIlkharf + soyisimKalan;

        String kullaniciAdi = isimSon + " " + soyisimSon;
        System.out.println(kullaniciAdi);
        return kullaniciAdi; // sautta neyi yazdirdiysak returna onu yaziyoruz
    }

    public static String kartNo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 16 haneli kart numaranizi aralarinda bosluk birakmadan yaziniz");
        String kart = scan.nextLine();

        String kart1 = kart.substring(0, 4);
        String kart2 = kart.substring(4, 8);
        String kart3 = kart.substring(8, 12);
        String kart4 = kart.substring(12,16);
        String kartSon = kart1 + " " + kart2 + " " + kart3 + " " + kart4;
        System.out.println(kartSon);
        return kartSon;
    }
}
