package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C13_Odev4 {

    public static void main(String[] args) {

        // 4) remove() methodu kullanarak, F’yi siliniz.
        // ArrayList’i ekrana yazdiriniz, list boyle olmali; A, L, C, D, B.

        List<String> harf= new ArrayList<>();
        harf.add("A");
        harf.add("L");
        harf.add("C");
        harf.add("D");
        harf.add("B");
        harf.add("F");
        System.out.println(harf); // [A, L, C, D, B, F]
        harf.remove("F");
        System.out.println(harf); // [A, L, C, D, B]
    }
}
