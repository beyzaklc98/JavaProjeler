package pratik2;

import java.util.ArrayList;
import java.util.List;

public class pratikCollection4 {

    public static void main(String[] args) {

        // Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
        // Array Elemanları: sari,yesil,mavi,pembe
        // mavi rengini turuncu ile değiştirelim.
        // Beklene Çıktı:
        // [sari,yesil,mavi,pembe]
        // [sari,yesil,turuncu,pembe]

        List<String> colour= new ArrayList<>();
        colour.add("sari");
        colour.add("yesil");
        colour.add("mavi");
        colour.add("pembe");
        System.out.println(colour);

        colour.set(2,"turuncu");
        System.out.println(colour);
    }
}
