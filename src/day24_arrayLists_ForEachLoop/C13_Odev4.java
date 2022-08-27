package day24_arrayLists_ForEachLoop;

import java.util.Arrays;

public class C13_Odev4 {

    public static void main(String[] args) {

        // Soru 4: Bir String olusturunuz, bu String’deki character’leri
        // for-each loop kullanarak yazdiriniz. ipucu: split()

        String str= "beyza tuba eymen ali";

        String [] str1= str.split("");

        for (String each: str1
             ) {
        }
        System.out.println(Arrays.toString(str1));
    }
}
