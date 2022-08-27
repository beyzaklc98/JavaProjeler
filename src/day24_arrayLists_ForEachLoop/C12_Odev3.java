package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12_Odev3 {

    public static void main(String[] args) {

        // Soru 1: Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini
        // For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

        Integer [] sayi= {2,12,3,4,5,23,57,8};

        List<Integer> toplam=new ArrayList<>();
        Arrays.sort(sayi);
        int carpim=1;
        for (Integer each: sayi
             ) {
            carpim*=each;
        }
        System.out.println(carpim);
    }
}
