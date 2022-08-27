package day17_nestedForLoop;

public class C14_Odev4 {

    public static void main(String[] args) {

        // Soru 4) Kullanicidan baslangic ve bitis haflerini alin
        //         ve baslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
        //         Kullanicinin hata yapmadigini farz edin.

        char c = 'k';
        char a = 'z';
        while (c <= a) {
            System.out.print(Character.toString(c).toUpperCase() + " "); // **********
            c++;
        }
        System.out.println(" ");

        char ilkHarf = 'f';
        char sonHarf = 't';
        char temp = ilkHarf;
        String buyult = "";

        while (temp <= sonHarf) {
            buyult = (temp + "").toUpperCase();
            System.out.print(buyult + " "); // **********
            temp += 1;
        }
    }
}
