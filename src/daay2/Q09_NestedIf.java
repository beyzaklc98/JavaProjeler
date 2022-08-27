package daay2;

public class Q09_NestedIf {

    public static void main(String[] args) {

        /*
          Kullanici dan yas bilgisini alarak
          oy kullanma yasi :
          age >= 18  ==> oy kullanmaya uygun
          age >= 70  ==> uc kez oy kullanabilir
          70 > age >=50 ==> iki kez oy kullanabilir
          50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
        */

        int yas=50;

        if(yas>=18) {
        }if (yas>=70) {
            System.out.println("uc kez oy kullanabilir");
        } else if (70>yas && yas>=50) {
            System.out.println("Iki kez oy kullanabilir");
        } else if (50>yas && yas>=18) {
            System.out.println("bir kez oy kullanabilir");
        }
    }
}
