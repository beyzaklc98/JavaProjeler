package pratik4_karisik;

public class bookRunner {

    public static void main(String[] args) {

        //String adi, yazari;
//int yayinYili;

// class da body icinde sag click->
// Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
//2  ve 3 pm li const olusturun
//main method bu class da olsun
//main method icinde obj leri create edin iki const tu da kullanin
//yazdir isimli method create edin
//ve bu methodlar olusturdugunuz obj leri yazdirin

       book b1=new book();

       b1.isim= "İcimizdeki Seytan";
       b1.soyisim="Sabahattin Ali";
       b1.yayinYili=2000;

        System.out.println(b1);

        book b2=new book();
        System.out.println(b2);

        book b3=new book("Kuyucakli Yusuf","Sabahattin Ali");
        System.out.println(b3);


    }

}
