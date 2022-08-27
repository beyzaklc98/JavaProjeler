package day11_stringManipulation;

public class C01_indexOf {

    public static void main(String[] args) {

        // Verilen bir String'de herhangi bir String veya Char'in
        // ilk kullanildigi index'i bize dondurur

        String str= "Java ogrenmek cok guzel";
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("r")); // 7
        System.out.println(str.indexOf("j")); // -1
        System.out.println(str.indexOf("mek")); // 10

        // ***** ***** ***** //
        // eger istedigimiz index'den sonrasini kontrol etmek istersek ayni methodu 2 parametre olarak kullaniriz

        System.out.println(str.indexOf("g",6+1)); // 18 yazilan index'ten baslar.

        // yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
        // 2. e'yi bulabilmek icin 1. e'nin index'sine ihtiyacim var

        int ilke= str.indexOf("e");
        int ikincie=str.indexOf("e", ilke+1); // **********

        // eger 2. e varsa 3.e'nin olup olmadigini
        // ve varsa index'ini yazdiralim

        if (ikincie==-1){
            System.out.println("verilen str'da 2. e yok");
        } else {
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str'da 3. e yok");
            } else{
                System.out.println("verilen str'daki 3. e'nin index'i: " +ucuncue);
            }
        }
    }
}
