package pratik4_karisik;

import java.util.ArrayList;
import java.util.List;

public class C01_Array {

    public class Test_Array {
        public static void main(String[] args) {

        /*
Girilen arraydeki sayilarin cift ve tek olanlarin toplamlarini bulunuz

input : int arr[] = {45,34,10,7,16,24,100};
 */

            int arr [] = {45,34,10,7,16,24,100};

            int tek=0;
            int cift=0;
            List<Integer> tekSayilar=new ArrayList<>();
            List<Integer> ciftSayilar=new ArrayList<>();



            for (int i=0; i<arr.length; i++) {
                if(arr[i]%2==0){
                    cift+=arr[i];
                    ciftSayilar.add(arr[i]);

                } else{
                    tek+=arr[i];
                    tekSayilar.add(arr[i]);
                }
            }

            System.out.println("Cift Sayilar;" + ciftSayilar);
            System.out.println("Tek Sayilar:" + tekSayilar);
            System.out.println("Cift sayilarin toplami: " + cift);
            System.out.println("Tek sayilarin toplami: " + tek);


        }
    }
}
