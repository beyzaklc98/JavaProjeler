package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C16_Odev7 {

    public static void main(String[] args) {

       // 7) size() methodu kullanarak, list’in kac eleman oldugunu ekrana yazdiriniz.

        List<String> eleman = new ArrayList<String>();

        eleman.add("1");
        eleman.add("2");
        eleman.add("8");
        eleman.add("67");
        eleman.add("56");
        eleman.add("100");
        System.out.println(eleman.size()); // 6
    }
}
