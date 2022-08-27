package pratik2;

import java.util.ArrayList;
import java.util.List;

public class pratikCollection5 {

    public static void main(String[] args) {

        // Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
        // ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

        // Beklenen Çıktı:
        // Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
        // siyah
        // mavi
        // kirmizi
        // yesil
        // mor
        // turuncu

        List<String> colour= new ArrayList<>();

        colour.add("siyah");
        colour.add("mavi");
        colour.add("kirmizi");
        colour.add("yesil");
        colour.add("mor");
        colour.add("turuncu");
        System.out.println(colour);

        System.out.println(colour.get(0));
        System.out.println(colour.get(1));
        System.out.println(colour.get(2));
        System.out.println(colour.get(3));
        System.out.println(colour.get(4));
        System.out.println(colour.get(5));

    }
}
