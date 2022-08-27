package day22_multiDimensionalArrays;

public class C10_Odev1 {

    public static void main(String[] args) {

        // verilen Multi Dimensional Array'in tum elemenalarının carpımını yazdıran bir method olusturun

        int[][] sayilar = {{1, 2, 3}, {4, 5, 6}};

        int carpim=1;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                carpim*= sayilar[i][j];
            }
        }
        System.out.println(carpim);
    }
}
