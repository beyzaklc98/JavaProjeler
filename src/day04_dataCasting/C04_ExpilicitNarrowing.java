package day04_dataCasting;

public class C04_ExpilicitNarrowing {

    public static void main(String[] args) {

        int sayi1 = 50;
        byte sayi2 = (byte) sayi1;
        System.out.println(sayi2); // 50

        // genis data turundekin degeri dar data turundeki variable'ye atamak isterseniz
        // Java sizin genis data turundeki degerin dar data turunun sinirlarina
        // calistirana kadar bilmez ama Java risk almaz
        // Riski sifira indirmek icin burada bir sorun olursa sorumlulugu kabul etmemizi bekler
        // bunun icin degerin onune parantez icerisinde istedigimiz data turunu yazmamiz yeterli

        int sayi3 = 500;
        byte sayi4 = (byte) sayi3;
        System.out.println(sayi4); // -12

        int sayi5 = -132;
        byte sayi6 = (byte) sayi5;
        System.out.println(sayi6); // 124

        // bu riski uslendigimizde, 3 durum olusabilir
        // 1) bizim degerimiz, dar kalip degerlerine uygun olursa hicbir kayip olmadan cast olur
        // 2) double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yasayabilirsiniz
        // 3) genis kaliptan degeri dar kaliba koydugunuzda, sinirlari asan durumlarda veri baskalasabilir.
    }
}
