package daay11_interviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class Q05 {

    public static void main(String[] args) {
        //nrmal toplmama methodu varargs ile toplama methodu yaziniz
        int[] arr = {17, 23, 33, 9, 20, 55};
        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        varargsToplaList(25, 55, 63, 21, 20);
        System.out.println("varargsToplaArr(arr) = " + varargsToplaArr(arr));
       //vararrgs array gibi davrandigi icin hehnagi bir array i pm olarak verebilkiriz
    }
    private static int varargsToplaArr(int... i) {
        int toplam = 0;
        for (int w : i) {
            toplam += w;
        }
        return toplam;
    }
    private static int varargsToplaList(int i, int i1, int i2, int i3, int i4) {
        List<Integer> list=new ArrayList<>();
        list.add(i);
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        int toplam = 0;
        for (int w : list) {
            toplam += w;
        }
        return toplam;
    }
    private static int arrTopla(int[] arr) {
        int toplam = 0;
        for (int w : arr) {
            toplam += w;
        }
        return toplam;
    }
}
