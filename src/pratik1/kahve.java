package pratik1;

public class kahve {

    public String isim= "isim girilmedi";
    public String boy= "boy girilmedi";
    public int fiyat;

    public kahve() {
    }

    // this keyword'u constructur icinde kullanilir ve this.variableIsmi seklinde yazildiginda
    // instance variableye gider.

    public kahve(String isim, String boy, int fiyat) {
        this.isim = isim;
        this.boy = boy;
        this.fiyat = fiyat;
    }

    // this olmazsa da olur ancak dinamik olmaz
    // this isim variablesini isim yap diyor

    public kahve(String isim, int fiyat) {
        this.isim = isim;
        this.fiyat = fiyat;
    }

    public kahve(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "\nisim : " + isim +
                "\nboy : " + boy +
                "\nfiyat : " + fiyat ;
    }
}
