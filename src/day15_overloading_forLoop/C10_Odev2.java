package day15_overloading_forLoop;

public class C10_Odev2 {

    public static void main(String[] args) {

        // Soru 2 ) 10 ile 30 arasindaki sayilari aralarinda virgul olarak ayni satirda yazdirin

        int bas=10;
        int son=30;


        for (int i = bas; i <=son ; i++) {

            if (i < son) {
                System.out.print(i + ","); // en sona virgul koymasin diye bunu ekledik *****
            } else {
                System.out.print(i);
            }
        }
    }
}
