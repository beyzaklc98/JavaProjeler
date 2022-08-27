package day26_constructor;
import day26_constructor.Kamyon;
import jdk.swing.interop.SwingInterOpUtils;
public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozelikleri " + kamyon1.toString()); // parametresiz constuructor sayesinde
        // kamyon1 ozelikleri
        // marka : Marka belirtilmedi
        // model : Model belirtilmedi
        // yil : 0
        // fiyat : 0

        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,500000);
        System.out.println("Kamyon2 bilgileri " + kamyon2);
        // Kamyon2 bilgileri
        // marka : Mercedes
        // model : 4140
        // yil : 2005
        // fiyat : 500000

        Kamyon kamyon3=new Kamyon("MAN","as900",2007,400000);
        System.out.println("Kamyon3 bilgileri " + kamyon3);
        // Kamyon3 bilgileri
        // marka : MAN
        // model : as900
        // yil : 2007
        // fiyat : 400000

        Kamyon kamyon4=new Kamyon("Scania","s540");
        System.out.println("Kamyon4 bilgileri " + kamyon4);
        // Kamyon4 bilgileri
        // marka : Scania
        // model : s540
        // yil : 0
        // fiyat : 0
    }
}
