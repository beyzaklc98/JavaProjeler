package day22_multiDimensionalArrays;

public class C11_Odev3 {

    public static void main(String[] args) {

        //Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz.
        // (Zor soru) arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

        int[][] arr1 = {{1,2},{3,4,5},{6}};
        int[][] arr2 ={{7,8,9},{10,11},{12}};

        int[] yeniArray=new int[arr1.length];
        int indexToplam=0;
        for (int i = 0; i < arr1.length && i< arr2.length ; i++) {
            for (int j = 0; j < arr1[i].length && j < arr2[i].length; j++) {
                indexToplam += arr1[i][j] + arr2[i][j];
            }
            System.out.println(i + ". index elemanların toplamı : " + indexToplam); //0. index elemanlar�n toplam� : 18
                                                                                    //1. index elemanlar�n toplam� : 28
                                                                                    //2. index elemanlar�n toplam� : 18
            indexToplam = 0;
        }
    }
}
