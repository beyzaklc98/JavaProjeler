package day12_stringManipulation;

public class C07_Odev {

    public static void main(String[] args) {

        // Soru 3) Kullanicidan isim isteyin. Eger
        //- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        //- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        //- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin

        String str1 = "javasız hayat cok zor";

        if (str1.contains("a")){
            System.out.println("a iceriyor");
        }
        if (str1.contains("z")){
            System.out.println("z iceriyor");
        }
        if ((!str1.contains("a") && !str1.contains("z"))){

            System.out.println("giridiginiz isim a ve z harfi icermiyor");
        }
    }
}