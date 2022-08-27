package pratik2;

import java.util.ArrayList;
import java.util.List;

public class pratikCollection3 {

    public static void main(String[] args) {

        // Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
        // ArrayList elemanları: beyaz,siyah,sari,kirmizi,turuncu
        // Beklenen Çıktı:
        // Arrayin 1. elemani: beyaz
        // Arrayin 3. elemani: sari

        List<String> colour= new ArrayList<>();

        colour.add("beyaz");
        colour.add("siyah");
        colour.add("sari");
        colour.add("kirmizi");
        colour.add("turuncu");
        System.out.println("Arrayin 1. elemani: "+colour.get(0));
        System.out.println("Arrayin 3. elemani: "+colour.get(2));
    }
}
