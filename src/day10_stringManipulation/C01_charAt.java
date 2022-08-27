package day10_stringManipulation;

public class C01_charAt {

    public static void main(String[] args) {

        String str = "Java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); // J ---> ilk harfi dondurur

        System.out.println(str.toUpperCase().charAt(7)); // R

        System.out.println(str.charAt(21)); // l

        // System.out.println(str.charAt(22));
        // bosluk da bir karakterdir yani bosluklari da sayariz
        // Java hata veririr cunku maxsimum indexden buyuk sayi istedik
        // son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz
        // eger index olarak uzunlugu veya daha buyuk bir sayiyi girersek Java exception veririr

        // charAt() methodu kullandigimizda sonuc char olacagindan artik manipulation yapamayiz **********
        // String method'larindan kullanmamiz gereken bir method varsa **********
        // charAt()'den once kullanmaliyiz **********
    }
}
