package daay1;

public class Q04_JavaVariable {

    public static void main(String[] args) {

        // Initializing Variable  // variable baslangic degeri verme

        int yas = 33;
        double boy = 1.70;
        System.out.println("yas: " + yas);
        System.out.println("boy: " + boy);

        // To copy the variable's value // variable'lerin degerlerini kopyalayabilirsiniz
        int yasim = 33;
        int enesYas = yasim;
        System.out.println("enesYas: " + enesYas);
        System.out.println("yasim: " + yasim);

        // you can declare multiple variables in the same line // ayni satirda atama yapilabilir

        int yil = 2022, ay = 6, gun = 20;
        System.out.println("yil: " + yil);

        // updating a variable

        yil = 2032;
        System.out.println("update yil: " + yil); // update degistirmek

        // Bir degisken tanimlayin : x
        // Baska bir degiskeni initialize edin : y
        // x degiskenini initialize edin
        // y degiskenini yeni bir degerle guncelleyin

        int x; // deklerasyon
        int y= 2000; // initialize yani assing
        x= 30; // initialize, ilk deger oldugu icin ismi bu
        y=1; // degiskeni guncellidik

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
