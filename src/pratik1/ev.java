package pratik1;

public class ev {

    public int kisiSayisi= 3;
    public int odaSayisi;
    public String meslekler= "meslekler belirtilmedi";
    public int maas= 6000;
    public String evRengi= "mavi";

    public ev() {
    }

    public ev(int kisiSayisi, int odaSayisi, String meslekler, int maas, String evRengi) {
        this.kisiSayisi = kisiSayisi;
        this.odaSayisi = odaSayisi;
        this.meslekler = meslekler;
        this.maas = maas;
        this.evRengi = evRengi;
    }

    @Override
    public String toString() {
        return "\nkisiSayisi : " + kisiSayisi +
                "\nodaSayisi : " + odaSayisi +
                "\nmeslekler : " + meslekler +
                "\nmaas : " + maas +
                "\nevRengi : " + evRengi ;
    }
}
