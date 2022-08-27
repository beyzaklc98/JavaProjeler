package pratik2;

import java.util.LinkedList;

public class pratikCollection8 {

    public static void main(String[] args) {

        // Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
        // LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

        // Beklenen Çıktı:
        // Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
        // Listenin ilk elemani: sari
        // listenin son elemani: beyaz

        LinkedList list = new LinkedList();
        LinkedList <String> listString = new LinkedList<>();

        list.add("sari");
        list.add("mavi");
        list.add("turuncu");
        list.add("siyah");
        list.add("yesil");
        list.add("beyaz");
        System.out.println(list);
        System.out.println("Listenin ilk elemani: "+list.get(0));
        System.out.println("Listenin son elemani: "+list.get(5));

    }
}
