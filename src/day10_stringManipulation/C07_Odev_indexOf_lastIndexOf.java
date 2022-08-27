package day10_stringManipulation;

public class C07_Odev_indexOf_lastIndexOf {

    public static void main(String[] args) {

        // Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin.

        String imput = "Java konumuz indexOf manipulation";

        if (imput.indexOf("J") == -1) {
            System.out.println("karakter cumlede yok");
        } else {
            System.out.println("karakter cumlede var");
        }

        // Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin.

        String cumle = "Javayi ogrenmek calisirsan cok kolay";
        String harf="j";

        if (cumle.lastIndexOf(harf) == -1) {
            System.out.println("harf cumlede yok");
        } else {
            System.out.println("harf cumlede var");
        }
    }
}
