package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {

    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.

        int [] sayilar={3,5,7,1,4,9,5,2};
        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) { // sadece max sayiyi yazdirmasini istiyorum onun icin void kaldi

        int maxSayi=sayilar[0]; // max sayiya deger atamam lazim, ilk elemani buna bir deger olarak atadim 0 da index
        for (int i = 1; i < sayilar.length; i++) { // zaten 0'i yukarda atadik bir daha kontrol etmemize gerek yok
            if(sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }
        }
        System.out.println("Arraydeki en buyuk sayi : "+maxSayi); // Arraydeki en buyuk sayi : 9
    }
}
