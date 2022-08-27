package day22_multiDimensionalArrays;
import java.util.Arrays;
import java.util.Scanner;
public class C12_Odev5 {

    public static void main(String[] args) {
        // Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle girin lutfen");
        String str= scan.nextLine();

        String[]cumle=str.split(" ");

        int kelimeSayisi=0;
        for (int i = 0; i <cumle.length; i++) {
            kelimeSayisi+=1;
        }
        System.out.println("Cumledeki kelimelar :"+ Arrays.toString(cumle)); // [Bir, cumle, girin, lutfen]
        System.out.println("Cumledeki kelime sayisi :"+kelimeSayisi); // 4
    }
}
