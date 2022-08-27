package day07_ifStatements;

public class C02_BasitIfStatements {

    public static void main(String[] args) {

        int sayi = 10;

        if (sayi > 0) {
            System.out.println("sayi pozitif"); // true, yazdirdi
        }
        if (sayi % 2 == 0) {
            System.out.println("sayi cift"); // true, yazdirdi
        }
        if (sayi % 5 == 0) {
            System.out.println("Sayi 5'in tam kati"); // true, yazdirdi
        }

        int sayi1 = 23;

        if (sayi1 > 0) {
            System.out.println("sayi1 pozitif"); // true, yazdirdi
            System.out.println("ss"); // true, yazdirdi
        }
        if (sayi1 % 2 == 0) {
            System.out.println("sayi1 cift"); // false, yazdirmadi
            System.out.println("aa"); // false old. icin yazdirmadi
        }
        if (sayi1 % 5 == 0) {
            System.out.println("Sayi1 5'in tam kati"); // false, yazdirmadi
        }

        // basit if cumleleri kodun diger parcalarindan bagimsizdir
        // sadece bir sart kontrol eder, eger saglaniyorsa, if bady calisir, yoksa calismaz
        // birden fazla if cumlesi varsa girilen sarta bagli olarak, tumunde if bady'si calisabilir
        // kismen if bady'ler calisabilir ya da hicbir if bady'si calismayabilir
    }
}
