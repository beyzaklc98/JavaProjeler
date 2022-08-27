package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C18_Odev9 {

    public static void main(String[] args) {

       // 9) isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz

        List<String> sayi=new ArrayList<String>();

        sayi.add("5");
        sayi.add("9");
        sayi.add("12");
        sayi.add("28");
        sayi.add("45");

        System.out.println(sayi.isEmpty()); // false
        System.out.println(sayi.size()); // 5

        sayi.clear();
        System.out.println(sayi.isEmpty()); // true
        System.out.println(sayi.size()); // 0

    }
}
