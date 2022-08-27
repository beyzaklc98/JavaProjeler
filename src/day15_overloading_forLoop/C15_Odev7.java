package day15_overloading_forLoop;

public class C15_Odev7 {

    public static void main(String[] args) {

        // Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

        String input="Javanin ustesinden gelecegiz.";

        String tersInput=input.substring(input.length()-1); // son harfi atamis olduk

        for (int i = input.length()-2; i >=0; i--) {
            tersInput+=input.substring(i,i+1); // i'den i+1'e kadar i+1 dahil degil
        }
        System.out.println(tersInput);
    }
}
