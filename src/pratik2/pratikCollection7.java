package pratik2;

import java.util.LinkedList;

public class pratikCollection7 {

    public static void main(String[] args) {

        // bir LinkedList oluşturalım ve Iterator methodunu kullanarak
        // listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.
        // LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
        // elemandan itibaren yazdıralım.

        // Beklenen Çıktı:
        // beyaz
        // mavi
        // yesil
        // turuncu

        LinkedList list = new LinkedList();
        LinkedList <String> listString = new LinkedList<>();

        list.add("beyaz");
        list.add("mavi");
        list.add("yesil");
        list.add("turuncu");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}
