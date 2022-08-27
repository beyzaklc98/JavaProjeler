package pratik4_karisik;

public class book {

    String isim= "deger girilmemistir";
    String soyisim="deger girilmemistir";
    int yayinYili;

    public book() {
    }

    public book(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public book(String isim, String soyisim, int yayinYili) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yayinYili = yayinYili;
    }

    @Override
    public String toString() {
        return "C04{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yayinYili=" + yayinYili +
                '}';
    }
}
