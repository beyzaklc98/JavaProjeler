package day07_ifStatements;

public class C03_BasitIfStatements {

    public static void main(String[] args) {

        /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur

        Eger birden fazla satir ayni if sartina baglanmissa mutlaka suslu parantes kullanmaliyiz {}
        */

        int sayi = 23;

        if (sayi > 0) // ; koyarsak burada biter alt satiri baglamaz
            System.out.println("sayi pozitif");
        System.out.println("pozitif kalacaktir"); // her zaman calisir {} yok cunku
        System.out.println("ucuncu satir"); // her zaman calisir {} yok cunku

        if (sayi % 2 == 0)
            System.out.println("sayi cift"); // false {} yok ve ilk satir oldugu icin calismadi
        System.out.println("cift kalacaktir"); // {} olmadigi icin her zaman calisir

        if (sayi % 5 == 0)
            System.out.println("Sayi 5'in tam kati"); // false, calismadi
    }
}

