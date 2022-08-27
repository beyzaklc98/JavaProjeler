package pratik2;

public class pratikArray9 {

    public static void main(String[] args) {

        // Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
        // Array: [1,2,3,4,5,6,7,8,9]

        int sayi[]={1,2,3,4,5,6,7,8,9};
        int cift=0;
        int tek=0;

        for (int i = 0; i < sayi.length; i++) {
            if(sayi[i]%2==0) {
                cift+=1;
            } else if(sayi[i]%2==1) {
                tek+=1;
            }
        }
        System.out.println("Tek sayilar : "+tek);
        System.out.println("Cift sayilar : "+cift);
    }
}
