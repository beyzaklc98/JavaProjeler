package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C17_Odev8 {

    public static void main(String[] args) {

       // 8) clear() methodu kullanarak, list’deki tum elemanlari siliniz.

        List<String> isim= new ArrayList<String>();

        isim.add("beyza");
        isim.add("tuba");
        isim.add("baris");
        isim.add("eymen");

        System.out.println(isim.isEmpty()); // false
        System.out.println(isim.size()); // 4

        isim.clear();
        System.out.println(isim.isEmpty()); // true
        System.out.println(isim.size()); // 0
    }
}
