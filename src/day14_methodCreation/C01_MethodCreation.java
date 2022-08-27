package day14_methodCreation;

public class C01_MethodCreation {

    public static void main(String[] args) {

        // imput olarak verilen 4 harfli bir Stringi
        // tersten yazdiran bir method olusturalim

        terstenYazdir("Okan"); // bunu yazdigimda cagirmis oluyorum ve kod calisiyor konsol bos olmuyor
    }
    public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                         input.substring(2,3) +
                         input.substring(1,2) +
                         input.substring(0,1);

        System.out.println("Verilen kelimenin tersten yazilisi : " + tersInput);
    }
}
