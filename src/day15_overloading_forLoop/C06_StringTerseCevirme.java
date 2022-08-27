package day15_overloading_forLoop;

public class C06_StringTerseCevirme {

    public static void main(String[] args) {

        // input olarak verilen String'i terse cevirip yazdiran bir method olusturun

        String input="Java gun gectikce guzellesiyor";

        terstenYazdirr(input); // input'umuzu terse terten cevirip yazdir dedgigimiz icn imput yazdik imputu gonderdik
    }

    public static void terstenYazdirr(String input) {
        String tersInput=input.substring(input.length()-1); // son harfi atamis olduk

        for (int i = input.length()-2; i >=0; i--) {
            tersInput+=input.substring(i,i+1); // i'den i+1'e kadar i+1 dahil degil
        }
        System.out.println(tersInput);
    }
}
