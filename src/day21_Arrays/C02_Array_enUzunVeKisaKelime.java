package day21_Arrays;

public class C02_Array_enUzunVeKisaKelime {

    public static void main(String[] args) {

        // Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

        String [] isimler={"Erdal","Onur","Mehmet","Hayrullah","Mihrican"};

        enUzunVeKisayiYazdir(isimler);
    }
    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];

        for (int i = 1; i <isimler.length ; i++) {
            if(isimler[i].length() > enUzunKelime.length()) { // for'daki length ifteki length() !!
                enUzunKelime=isimler[i];
            }
            if(isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime = isimler[i];
            }
        }
        System.out.println("Arraydaki en uzunkelime : "+enUzunKelime); // Arraydaki en uzunkelime : Hayrullah
        System.out.println("Arraydaki en kisakelime : "+enKisaKelime); // Arraydaki en kisakelime : Onur .
    }
}
