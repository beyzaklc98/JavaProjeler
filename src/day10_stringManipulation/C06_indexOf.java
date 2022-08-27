package day10_stringManipulation;

public class C06_indexOf {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t")); // bana integer donduruyor
                                              // int'te yok diye bir deger bulunmuyor
                                              // 0 dersek J'nin indexsidir
                                              // - bir deger donerse biz aranan string'in str'de olmadigini anlariz
                                              // Java -1 dondurmeyi tercih etmistir

        String str5 = "wkdsbddfkçdkçbvbddfkvbfhgjfvhfdhf";
        // str5'tr h harfi kullanilmis midir

        if (str5.indexOf("=") == -1) {
            System.out.println("str5 de istenen karakter kullanilmamis");
        } else {
            System.out.println("str5 de istenen karakter kullanilmis");
        }
    }
}
