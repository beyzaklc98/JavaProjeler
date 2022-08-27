package pratik2;

import java.util.Arrays;

public class pratikArray6 {

    public static void main(String[] args) {

        // Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
        // Array: [12,15,43,23,56,76,78,90,77,43]
        // Aranan değer:56
        // Beklenen Çıktı:
        // 56 sayısı arrayin 4. elemanı

        int sayi[]={12,15,43,23,56,76,78,90,77,43};

        int istenen=56;
        int aranan=0;
        int elemanSayisi=0;

        for (int i = 0; i < sayi.length; i++) {


            if(sayi[i]==istenen){
                aranan+=sayi[i];
                break;
            }
            elemanSayisi++;
        }
        System.out.println(aranan+" sayisi arrayin "+elemanSayisi+". elemani");
    }
}
