package day02_variables;

public class C01_Variables {

    public static void main(String[] args) {

        int             not             =                   60                 ;

        //data turu    variable ismi    assignment sing     variable degeri    islem bitti isareti

        int not2      =     70;
        //variable         degerr
        //java once degeri hesaplar sonra assingn islemini yapar

        not2=90;

        // yeni bir variable olusturalim degeri ilk iki variable'in ortalamasi olsun

        int ort = (not + not2) / 2; // (60+90)/2= 75
        System.out.println(ort);

        // cift tirnak icinde yazilan her sey metindir, Java "" icinde ne gorurse o sekilde yazdirir
        // eger bir variable'in degerini yazdirmak istiyorsaniz
        // "" olmadan variable ismini yazmalisiniz
    }
}
