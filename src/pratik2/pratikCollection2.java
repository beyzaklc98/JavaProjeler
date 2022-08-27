package pratik2;

import java.util.ArrayList;
import java.util.List;

public class pratikCollection2 {

    public static void main(String[] args) {

        // Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
        // Array List: siyah,mavi,kirmizi,beyaz
        // en başa: pembe
        // mavi-kirmizi arasına yesil renk eklenecek.

        List<String> renk= new ArrayList<>();

        renk.add("pembe");
        renk.add("siyah");
        renk.add("mavi");
        renk.add("yesil");
        renk.add("kirmizi");
        renk.add("beyaz");
        System.out.println(renk);
    }
}
