package day15_overloading_forLoop;

public class C16_Odev8 {

    public static void main(String[] args) {

        // Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir program yazin.

        String ters= tersineCevir();
        // System.out.println(ters); ---> buraya da yazabilirdik bu sekilde
    }

    private static String tersineCevir() {

        String input="Javanin ustesinden gelecegiz.";
        String tersInput=input.substring(input.length()-1); // son harfi atamis olduk

        for (int i = input.length()-2; i >=0; i--) {
            tersInput+=input.substring(i,i+1); // i'den i+1'e kadar i+1 dahil degil
        }
        System.out.println(tersInput);
        return tersInput;
    }
}
