package day11_stringManipulation;

public class C02_lastIndexOf {

    public static void main(String[] args) {

        String cumle= "Java cok kolay,Java cok guzel";
        String kelime = "Java";

        // Verilen kelime icin asagidaki sartlardan uygun olan programi yaziniz
        // verien kelime cumlede kullanilmamis
        // verilen kelime cumlede sadece bir kere kullanilmis
        // verilen kelime cumlede birden fazla kullanilmis

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verien kelime cumlede kullanilmamis");
        } else if (kelimeIlkIndex==kelimeSonIndex){
            System.out.println(" verilen kelime cumlede sadece bir kere kullanilmis");
        } else{
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }
    }
}
