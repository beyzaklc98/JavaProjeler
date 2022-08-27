package day15_overloading_forLoop;

public class C02_OverLoading {

    public static void main(String[] args) {

        /*
         Javada olusturdugumuz methodlarin isminin yaptigi islev ile uyumlu olmasini isteriz
         mesela bir String'in bir bolumunu almak icin Java
         substring() method'u veya
         Verilen Stringdeki bazi parcalari yenileriyle degistirmek icin
         2 adet replace() methodu var

         Java ayni isimde birden fazla method varsa
         hangisinin kullanilacagina parametre sayisi ve
         parametrelerin data turlerine gore karar verir
         */

        String str="Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);

        str.replace('c','v');
        str.replace("J","H");
        // str.replace(5,8);

        /*
         ayni isimde ama farkli methodlari olusturmak icin
         degistirebilecegimiz seyler
         1. parametre sayisi
         2. ayni sayida parametreye sahip olsa bile, parametrelerin data turleri
         3. ayni sayida ve ayni data turlerinde parametreleri olan methodtarda parametrelerin siralanisi
         */
    }
}
