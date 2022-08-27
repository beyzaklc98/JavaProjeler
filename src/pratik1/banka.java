package pratik1;

public class banka {

    public String bankaIsmi="Is Bankasi";
    public int bakiye= 1000;
    public int yatirilacakTutar;


    public banka() {

    }

    public banka(String bankaIsmi, int yatirilacakTutar, int bakiye) {
        this.bankaIsmi = bankaIsmi;
        this.yatirilacakTutar = yatirilacakTutar;
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "\nbankaIsmi : " + bankaIsmi +
                "\nyatirilacakTutar : " + yatirilacakTutar +
                "\nbakiye : " + bakiye;

    }
}
