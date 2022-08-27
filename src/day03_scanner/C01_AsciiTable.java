package day03_scanner;

public class C01_AsciiTable {

    public static void main(String[] args) {

        // 6) Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin

        int sayi=10;
        char harf= 'a';
        String str= "banan";
        System.out.println(sayi+harf); // 10 + a'nin ascii degerini alıp isleme girerek yazdirir
        System.out.println(str+harf); // banana *****
        System.out.println(sayi*harf); // 970
        System.out.println(harf +2); // 99
        System.out.println(str + sayi + harf); // banan10a

        // char yeniHarf = harf+2

        /* 1) char data turu isleme girdigi degiskenin turune gore farkli davranabilir
           eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir
           sayi+harf sayi variable'i int oldugundan harf variable'i ascii tablosundan 97 degerini kullanir

           char yeniHarf = harf+2: Java once sagdaki islemi yapar, sagda int + char gorunce ascii degerini
           sonra atama islemini yapmaya calisir
           char yeniHarf=99;
           bu atama java acisindan kabul edilebilir degil */

        // 2) str+harf; banana String variable cok gucludur, hangi data turu ile isleme girerse
        //              girsin diger data turunu kendisine benzetir

        // 3) konsolda verilen variable'lari kullanarak 10a gormek istersek nasil yazdiririz

        System.out.println("" + sayi + harf); // 10a

        char deger= '1';
        System.out.println(deger + harf); // 49+97=146 '1' + 'a'
    }
}
