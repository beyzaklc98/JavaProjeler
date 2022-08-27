package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C15_Odev6 {

    public static void main(String[] args) {

        // 6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadigini dogrulayiniz.

        List<String> harf= new ArrayList<>();
        harf.add("B");
        harf.add("E");
        harf.add("L");
        harf.add("S");
        harf.add("U");
        System.out.println(harf.contains("L")); // true
        System.out.println(harf.contains("M")); // false
    }
}
