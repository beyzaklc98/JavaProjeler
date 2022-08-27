package pratik2;
import java.util.LinkedList;
public class pratikCollection6 {

    public static void main(String[] args) {

        // Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
        // LinkedList elemanları: sari,mavi,mor,yesil,beyaz

        // Beklenen Çıktı:
        // sari
        // mavi
        // mor
        // yesil
        // beyaz
        LinkedList list = new LinkedList();
        LinkedList <String> listString = new LinkedList<>();

        list.add("sari");
        list.add("mavi");
        list.add("mor");
        list.add("yesil");
        list.add("beyaz");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
    }
}
