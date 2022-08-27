package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_Odev1 {

    public static void main(String[] args) {

       // 1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.

        List<String> harfler= new ArrayList<String>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        System.out.println(harfler); // [A, C, E, F]
    }
}
