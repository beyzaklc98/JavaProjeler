package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C11_Odev2 {

    public static void main(String[] args) {

        // 2) indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
        // index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
        // ArrayList’i ekrana yazdiriniz, list boyle olmali; A, L, C, E, F, B.

        List<String> harf= new ArrayList<String>();
        harf.add("A");
        harf.add("C");
        harf.add("E");
        harf.add("F");
        harf.add("B");
        harf.add(1,"L");
        System.out.println(harf); // [A, L, C, E, F, B]
    }
}
