package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Odev4 {

    public static void main(String[] args) {

        // Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin

        String[] sehirler ={"Istanbul", "Ankara","Mersin","Konya","Kastamonu"};
        String istenmeyenHarf="r";
        List<String> kalanlar=new ArrayList<>();
        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }
        }
        //loop bittiginde istenmeyen harf icermeyen sehirler, listeye eklenmis olacak
        System.out.println(kalanlar); // [Istanbul, Konya, Kastamonu]
        // yeni bir array olusturup, listeyi ona aktaralim
        String[] kalanlarArrayi=new String[kalanlar.size()]; // *****
        for (int i = 0; i <kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);
        }
        // sehirler array'inin yeni degerini atayalim
        sehirler=kalanlarArrayi;
        System.out.println("sehirler array'inin son hali : " + Arrays.toString(sehirler));
        // sehirler array'inin son hali : [Istanbul, Konya, Kastamonu]
    }
}
