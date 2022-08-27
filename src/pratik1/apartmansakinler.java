package pratik1;

public class apartmansakinler {

    public int kisi=0;
    public int katSayisi=5;
    public int daireNo=6;

    public apartmansakinler() {

    }

    public apartmansakinler(int kisi, int katSayisi, int daireNo) {
        this.kisi = kisi;
        this.katSayisi = katSayisi;
        this.daireNo = daireNo;
    }

    @Override
    public String toString() {
        return
                "\nkisi=" + kisi +
                "\nkatSayisi=" + katSayisi +
                "\ndaireNo=" + daireNo;
    }
}
