package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C12_Odev3 {

    public static void main(String[] args) {

         // 3) set() methodu kullanarak, E’yi D yapiniz.
        // ArrayList’i ekrana yazdiriniz, list boyle olmali; A, L, C, D, F, B.

        List<String> harf= new ArrayList<String>();

        harf.add("A");
        harf.add("L");
        harf.add("C");
        harf.add("E");
        harf.add("F");
        harf.add("B");
        harf.set(3,"D");
        System.out.println(harf); // [A, L, C, D, F, B]
    }
}
