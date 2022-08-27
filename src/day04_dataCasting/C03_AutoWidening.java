package day04_dataCasting;

public class C03_AutoWidening {

    public static void main(String[] args) {

        byte sayi1 = 23;
        short sayi2 = 55;

        int sayi3 = sayi1 + sayi2; // 88

        double sayi4 = sayi1 * sayi2; //1265.0

        sayi4 =  sayi2 / sayi1; // sayi2/sayi1 = 2.391 ama sonuc 2 virgulu atar sonra double diye 0 eklendi
                                       // bu kaybi ancak data casting ile engelleyebiliriz

        System.out.println(sayi4); // 2.0 *****
    }
}
