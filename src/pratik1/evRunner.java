package pratik1;

public class evRunner {

    public static void main(String[] args) {

        ev ev1= new ev(3, 4, "ogretmen",6000, "mavi");
        System.out.println(ev1);
        // kisiSayisi : 3
        // odaSayisi : 4
        // meslekler : ogretmen
        // maas : 6000
        // evRengi : mavi

        ev ev2= new ev();
        System.out.println(ev2);
        // kisiSayisi : 3
        // odaSayisi : 0
        // meslekler : meslekler belirtilmedi
        // maas : 6000
        // evRengi : mavi
    }
}
