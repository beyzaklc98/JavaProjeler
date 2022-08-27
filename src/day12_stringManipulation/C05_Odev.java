package day12_stringManipulation;

public class C05_Odev {

    public static void main(String[] args) {

        // Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini
        //         “Java ogrenmek cok guzel.” sekline getirin.

        String str= "Java ogrenmek123 Cok guzel@";

        System.out.println(str.trim().replaceAll("\\d","").replace("@",".")
                .replace("C","c") );
    }
}
