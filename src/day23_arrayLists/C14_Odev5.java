package day23_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C14_Odev5 {

    public static void main(String[] args) {

        // 5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        // ArrayList’i ekrana yazdiriniz, list boyle olmali; A, B, C, D, L.

        List<String> harf= new ArrayList<String>();

        harf.add("C");
        harf.add("L");
        harf.add("D");
        harf.add("A");
        harf.add("B");
        Collections.sort(harf);
        System.out.println(harf); // [A, B, C, D, L]

    }
}
