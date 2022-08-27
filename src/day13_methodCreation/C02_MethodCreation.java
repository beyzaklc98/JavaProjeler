package day13_methodCreation;

public class C02_MethodCreation {

    public static void main(String[] args) {

        // input olarak verilen 2 integer'i toplayip sonucu yazdirin
        // bir method olusturun

        int input1 = 10;
        int input2 = 20;

        // method 4 adimda olusturulur
        // 1. adim method call
        // 2. adim argument eklenmesi gerekiyorsa ekleyelim
        // eger methodun return type voidden farkli olacaksa
        // bir variable olusturup, method call'u assign edelim

        topla(input1,input2);
    }

    private static void topla(int input1, int input2) {

        // 3. adim method deklerasyonunda degistirilmesi gereken
        // bolumleri degisir (access modifler, return Type vb...)
        // 4. eger return type void disinda bir seyse
        // return keyword'u ve donecek degeri hesaplamaliyiz
        System.out.println("Girilen iki sayinin toplami: " + (input1+input2));
    }
}
