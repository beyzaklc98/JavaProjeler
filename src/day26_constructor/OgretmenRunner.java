package day26_constructor;
public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen 1 " + ogretmen1);
        // Ogretmen 1
        // isim : Isim belirtilmedi
        // soyisim : Soyisim belirtilmedi
        // dogumTarihi : Tarih girilmedi
        // brans : Brans belirtilmedi
        // yanBrans : Yan brans belirtilmedi

        Ogretmen ogretmen2=new Ogretmen("Emre","Akdogan","1/1/2001","Matematik","Fizik");
        System.out.println("Ogretmen 2 " + ogretmen2);
        // Ogretmen 2
        // isim : Emre
        // soyisim : Akdogan
        // dogumTarihi : 1/1/2001
        // brans : Matematik
        // yanBrans : Fizik

        Ogretmen ogretmen3=new Ogretmen("Cavidan","Kabinkara","1/1/1991");
        System.out.println("Ogretmen 3 " + ogretmen3);
        // Ogretmen 3
        // isim : Cavidan
        // soyisim : Kabinkara
        // dogumTarihi : 1/1/1991
        // brans : Brans belirtilmedi
        // yanBrans : Yan brans belirtilmedi
    }
}