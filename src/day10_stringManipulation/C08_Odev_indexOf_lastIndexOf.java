package day10_stringManipulation;

public class C08_Odev_indexOf_lastIndexOf {

    public static void main(String[] args) {

        // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumledeki  kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        // Girilen kelime cumlede kullanilmamis.
        // Girilen kelime cumlede 1 kere kullanilmis.
        // Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle= "Java cok kolay,Java cok guzel";
        String kelime = "Java";

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verien kelime cumlede kullanilmamis");
        } else if (kelimeIlkIndex==kelimeSonIndex){
            System.out.println(" verilen kelime cumlede sadece 1 kere kullanilmis");
        } else{
            System.out.println("verilen kelime cumlede 1'den fazla kullanilmis");
        }
    }
}
