package day15_overloading_forLoop;

public class C11_Odev3 {

    public static void main(String[] args) {

       // Soru 3) 100’den baslayarak 50’ye kadar olan sayilari aralarinda virgul koyarak ayni satirda yazdirin

        for (int i = 100; i >=50 ; i--) {

            if(i>50){
                System.out.print(i+","); // *****
            }else{
                System.out.print(i);
            }
        }
    }
}
