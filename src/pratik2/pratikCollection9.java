package pratik2;

import java.util.LinkedList;

public class pratikCollection9 {

    public static void main(String[] args) {

        // Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
        // LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

        // Beklenen Çıktı:
        // Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
        // LinkedList Tersi:
        // mor
        // beyaz
        // kirmizi
        // yesil
        // mavi
        // sari

        LinkedList list= new LinkedList<>();
        LinkedList<String> list2= new LinkedList<>();

        list.add("sari");
        list.add("mavi");
        list.add("yesil");
        list.add("kirmizi");
        list.add("beyaz");
        list.add("mor");

        System.out.println("Orijinal linked list: "+"\n"+list);


    }
}
