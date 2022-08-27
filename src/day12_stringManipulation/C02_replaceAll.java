package day12_stringManipulation;

public class C02_replaceAll {

    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        // str'i Bugun Java cok guzel haline getirin
        // replaceAll'deki all'in amaci ayni ozellikteki tum karakterleri kaplamasidir
        // butun sayilari sil
        // butun ozel karakterleri sil

        // tum ozel karakterleri silelim dedigimizde space'ler de siliniyor
        // space'leri korumak icin onlari korumak icin en basta onlarin yerine cumle bulunmayacak bir string koyalim
        // "qazwsx"

        str = str.replace(" ", "qazwsx");  // **********
        System.out.println(str); // 1Bu2gu3ngazwsxJa*va-gazwsxcokg3uz/el

        str = str.replaceAll("\\d", "").replaceAll("\\W", "");
        System.out.println(str); // BugungazwsxJavacokguzel

        // istenmeyen ozel karakter ve sayilardan kurtulduk
        // simdi space'leri geri getirelim

        str = str.replace("qazwsx", " ");
        System.out.println(str); // Bugun Java cok guzel
    }
}
